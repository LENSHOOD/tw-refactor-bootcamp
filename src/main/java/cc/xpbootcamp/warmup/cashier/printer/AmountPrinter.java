package cc.xpbootcamp.warmup.cashier.printer;

/**
 * AmountPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class AmountPrinter extends PrinterNode {
    private String description;
    private double amount;

    public AmountPrinter(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    @Override
    protected Input doPrint(Input input) {
        return input
                .append(description)
                .append(": ")
                .append(String.format("%.2f", amount))
                .append("\n");
    }
}
