package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.ItemInfo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ItemInfoPrinterTest {
    @Test
    void should_get_name_price_qty_total_when_print_item_info() {
        ItemInfo info = new ItemInfo("milk", 10.0, 2);
        ItemInfoPrinter itemInfoPrinter = new ItemInfoPrinter(info);

        Output output = itemInfoPrinter.print(new Input());

        Assertions.assertThat(output.get()).isEqualTo("milk, 10.00 x 2, 20.00\n");
    }
}