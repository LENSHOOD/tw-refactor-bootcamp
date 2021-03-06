package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintedMatter;
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

        PrintedMatter printedMatter = datePrinter.print(PrintElement.blankPrintElement());

        String expect = now.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy年MM月dd, EEEE", Locale.CHINESE)) + "\n";
        Assertions.assertThat(printedMatter.get()).isEqualTo(expect);
    }
}