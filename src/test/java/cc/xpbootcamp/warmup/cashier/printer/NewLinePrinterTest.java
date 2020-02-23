package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NewLinePrinterTest {
    @Test
    void should_return_new_line_char_when_print_new_line() {
        NewLinePrinter newLinePrinter = new NewLinePrinter();

        PrintedMatter printedMatter = newLinePrinter.print(PrintElement.blankPrintElement());

        Assertions.assertThat(printedMatter.get()).isEqualTo("\n");
    }
}