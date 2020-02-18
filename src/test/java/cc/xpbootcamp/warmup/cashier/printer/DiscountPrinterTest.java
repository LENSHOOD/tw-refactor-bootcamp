package cc.xpbootcamp.warmup.cashier.printer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class DiscountPrinterTest {
    @Test
    void should_return_empty_when_discount_is_zero() {
        DiscountPrinter discountPrinter = new DiscountPrinter("Discount", 0.0);

        Output output = discountPrinter.print(new Input());

        Assertions.assertThat(output.get()).isBlank();
    }
}