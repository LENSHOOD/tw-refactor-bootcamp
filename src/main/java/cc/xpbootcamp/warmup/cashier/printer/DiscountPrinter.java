package cc.xpbootcamp.warmup.cashier.printer;

/**
 * DiscountPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class DiscountPrinter extends AmountPrinter {
    private double discount;

    public DiscountPrinter(String description, double amount) {
        super(description, amount);
        discount = amount;
    }

    @Override
    protected Input doPrint(Input input) {
        return Double.valueOf(discount).equals(0.0) ? input : super.doPrint(input);
    }
}
