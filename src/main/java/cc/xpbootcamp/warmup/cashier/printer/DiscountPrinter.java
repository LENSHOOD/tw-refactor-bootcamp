package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;

import java.math.BigDecimal;

/**
 * DiscountPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class DiscountPrinter extends AmountPrinter {
    private BigDecimal discount;

    public DiscountPrinter(String description, BigDecimal amount) {
        super(description, amount);
        discount = amount;
    }

    @Override
    protected PrintElement doPrint(PrintElement printElement) {
        return discount.equals(BigDecimal.ZERO) ? printElement : super.doPrint(printElement);
    }
}
