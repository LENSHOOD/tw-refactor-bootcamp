package cc.xpbootcamp.warmup.cashier.printer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * DatePrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class DatePrinter extends PrinterNode {
    private LocalDate date;
    private static final String DATE_PATTERN = "yyyy年MM月dd, EEEE";

    public DatePrinter(LocalDate date) {
        this.date = date;
    }

    @Override
    protected Input doPrint(Input input) {
        return input.append(date.format(DateTimeFormatter.ofPattern(DATE_PATTERN, Locale.CHINESE))).append("\n");
    }
}
