package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DiscountPrinterTest {
    @Test
    void should_return_empty_when_discount_is_zero() {
        DiscountPrinter discountPrinter = new DiscountPrinter("Discount", BigDecimal.ZERO);

        PrintedMatter printedMatter = discountPrinter.print(PrintElement.blankPrintElement());

        Assertions.assertThat(printedMatter.get()).isBlank();
    }
}