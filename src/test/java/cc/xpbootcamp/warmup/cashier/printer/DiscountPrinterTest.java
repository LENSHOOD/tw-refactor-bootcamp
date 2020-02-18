package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.Output;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DiscountPrinterTest {
    @Test
    void should_return_empty_when_discount_is_zero() {
        DiscountPrinter discountPrinter = new DiscountPrinter("Discount", 0.0);

        Output output = discountPrinter.print(new Input());

        Assertions.assertThat(output.get()).isBlank();
    }
}