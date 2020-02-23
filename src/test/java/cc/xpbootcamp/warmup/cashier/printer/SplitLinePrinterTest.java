package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitLinePrinterTest {
    @Test
    void should_return_split_line_when_print_split_line() {
        SplitLinePrinter splitLinePrinter = new SplitLinePrinter();

        PrintedMatter printedMatter = splitLinePrinter.print(PrintElement.blankPrintElement());

        Assertions.assertThat(printedMatter.get()).isEqualTo("-----------------------------------\n");
    }
}