package cc.xpbootcamp.warmup.cashier;

import java.util.Optional;

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
                getCustomerNameWithAddress() +
                getItemInfos() +
                getSalesTax() +
                getTotalAmount();
    }

    private String getHeaders() {
        return HEADERS;
    }

    private String getCustomerNameWithAddress() {
        return Optional.ofNullable(order.getCustomerName()).orElse("") +
                Optional.ofNullable(order.getCustomerAddress()).orElse("");
    }

    private String getItemInfos() {
        return order.getItemInfos()
                .stream()
                .map(this::getItemInfo)
                .reduce((prev, curr) -> prev + curr).orElse("");
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

    private String getSalesTax() {
        return "Sales Tax" + '\t' + order.tax();
    }

    private String getTotalAmount() {
        return "Total Amount" + '\t' + order.totalAmount();
    }
}