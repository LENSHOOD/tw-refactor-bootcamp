package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.Output;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AmountPrinterTest {
    @Test
    void should_return_name_with_amount_when_print_amount() {
        AmountPrinter amountPrinter = new AmountPrinter("Sales Tax", 6.5);

        Output output = amountPrinter.print(new Input());

        Assertions.assertThat(output.get()).isEqualTo("Sales Tax: 6.50\n");
    }
}