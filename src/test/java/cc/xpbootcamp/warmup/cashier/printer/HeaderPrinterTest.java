package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.Output;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HeaderPrinterTest {
    @Test
    void should_get_header_when_print_header() {
        HeaderPrinter headerPrinter = new HeaderPrinter();

        Output output = headerPrinter.print(new Input());

        assertThat(output.get()).isEqualTo("===== 老王超市，值得信赖 ======\n");
    }
}