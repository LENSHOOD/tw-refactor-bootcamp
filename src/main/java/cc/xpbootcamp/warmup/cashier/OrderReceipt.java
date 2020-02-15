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
        StringBuilder output = new StringBuilder();

        output.append(getHeaders());

        output.append(getCustomerNameWithAddress(order));

        double orderTax = 0d;
        double orderAmount = 0d;
        for (ItemInfo itemInfo : order.getItemInfos()) {
            output.append(getItemInfo(itemInfo));
            double salesTax = itemInfo.totalAmount() * .10;
            orderTax += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            orderAmount += itemInfo.totalAmount() + salesTax;
        }

        // prints the state tax
        output.append("Sales Tax").append('\t').append(orderTax);

        // print total amount
        output.append("Total Amount").append('\t').append(orderAmount);
        return output.toString();
    }

    private String getHeaders() {
        return HEADERS;
    }

    private String getCustomerNameWithAddress(Order order) {
        return order.getCustomerName() + order.getCustomerAddress();
    }

    private String getItemInfo(ItemInfo itemInfo) {
        return itemInfo.getDescription() +
                '\t' +
                itemInfo.getPrice() +
                '\t' +
                itemInfo.getQuantity() +
                '\t' +
                itemInfo.totalAmount() +
                '\n';
    }
}