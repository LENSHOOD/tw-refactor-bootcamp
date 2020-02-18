package cc.xpbootcamp.warmup.cashier.printer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class NewLinePrinterTest {
    @Test
    void should_return_new_line_char_when_print_new_line() {
        NewLinePrinter newLinePrinter = new NewLinePrinter();

        Output output = newLinePrinter.print(new Input());

        Assertions.assertThat(output.get()).isEqualTo("\n");
    }
}