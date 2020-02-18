package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.Output;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class DatePrinterTest {
    @Test
    void should_get_date_with_day_of_week_when_print_date() {
        ZonedDateTime now = ZonedDateTime.now();
        DatePrinter datePrinter = new DatePrinter(now.toLocalDate());

        Output output = datePrinter.print(new Input());

        String expect = now.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy年MM月dd, EEEE", Locale.CHINESE)) + "\n";
        Assertions.assertThat(output.get()).isEqualTo(expect);
    }
}