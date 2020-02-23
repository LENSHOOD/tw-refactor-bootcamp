package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.ItemInfo;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemInfoPrinterTest {
    @Test
    void should_get_name_price_qty_total_when_print_item_info() {
        ItemInfo info = new ItemInfo("milk", 10.0, 2);
        ItemInfoPrinter itemInfoPrinter = new ItemInfoPrinter(info);

        PrintedMatter printedMatter = itemInfoPrinter.print(PrintElement.blankPrintElement());

        Assertions.assertThat(printedMatter.get()).isEqualTo("milk, 10.00 x 2, 20.00\n");
    }
}