package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * AmountPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class AmountPrinter extends PrinterNode {
    private static final int FLOAT_SCALE = 2;
    private String description;
    private BigDecimal amount;

    public AmountPrinter(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    @Override
    protected Input doPrint(Input input) {
        return input
                .append(description)
                .append(": ")
                .append(amount.setScale(FLOAT_SCALE, RoundingMode.HALF_UP).toString())
                .append("\n");
    }
}
