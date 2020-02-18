package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.Output;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitLinePrinterTest {
    @Test
    void should_return_split_line_when_print_split_line() {
        SplitLinePrinter splitLinePrinter = new SplitLinePrinter();

        Output output = splitLinePrinter.print(new Input());

        Assertions.assertThat(output.get()).isEqualTo("-----------------------------------\n");
    }
}