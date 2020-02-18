package cc.xpbootcamp.warmup.cashier;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 *
 */
public class OrderReceipt {
    private static final String HEADERS = "======Printing Orders======\n";

    private Order order;
    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        return getHeaders() +
                getItemInfos() +
                getSalesTax() +
                getDiscount() +
                getTotalAmount();
    }

    private String getHeaders() {
        return HEADERS;
    }

    private String getItemInfos() {
        return order.getItemInfos()
                .stream()
                .map(this::getItemInfo)
                .reduce((prev, curr) -> prev + curr).orElse("");
    }

    private String getItemInfo(ItemInfo itemInfo) {
        return itemInfo.getDescription() +
                ", " +
                formatAs2Digit(itemInfo.getPrice()) +
                " x " +
                itemInfo.getQuantity() +
                ", " +
                formatAs2Digit(itemInfo.totalAmount()) +
                '\n';
    }

    private String getDiscount() {
        double discount = order.discount();
        return Double.valueOf(discount).equals(0.0) ? "" : "Discount: " + formatAs2Digit(discount) + '\n';
    }

    private String getSalesTax() {
        return "Sales Tax: " + formatAs2Digit(order.tax()) + '\n';
    }

    private String getTotalAmount() {
        return "Total Amount: " + formatAs2Digit(order.totalAmount()) + '\n';
    }

    private String formatAs2Digit(double num) {
        return String.format("%.2f", num);
    }
}