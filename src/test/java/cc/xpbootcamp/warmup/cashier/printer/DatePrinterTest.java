package cc.xpbootcamp.warmup.cashier.printer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

class DatePrinterTest {
    @Test
    void should_get_date_with_day_of_week_when_print_date() {
        ZonedDateTime now = ZonedDateTime.now();
        DatePrinter datePrinter = new DatePrinter(now.toLocalDate());

        Output output = datePrinter.print(new Input());

        String expect = now.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy L d, E"));
        Assertions.assertThat(output.get()).isEqualTo(expect);
    }
}