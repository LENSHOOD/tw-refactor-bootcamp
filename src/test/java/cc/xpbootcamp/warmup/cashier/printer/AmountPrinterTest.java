package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AmountPrinterTest {
    @Test
    void should_return_name_with_amount_when_print_amount() {
        AmountPrinter amountPrinter = new AmountPrinter("Sales Tax", BigDecimal.valueOf(6.5));

        PrintedMatter printedMatter = amountPrinter.print(PrintElement.blankPrintElement());

        Assertions.assertThat(printedMatter.get()).isEqualTo("Sales Tax: 6.50\n");
    }
}