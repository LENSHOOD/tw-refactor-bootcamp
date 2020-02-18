package cc.xpbootcamp.warmup.cashier;

import cc.xpbootcamp.warmup.cashier.printer.*;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 *
 */
public class OrderReceipt {
    private Order order;
    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        PrinterNode head = new HeaderPrinter()
                .addNode(new DatePrinter(order.getCreateTime().toLocalDate()));

        order.getItemInfos().stream().map(ItemInfoPrinter::new).forEach(head::addNode);

        head.addNode(new SplitLinePrinter())
                .addNode(new AmountPrinter("Sales Tax", order.tax()))
                .addNode(new DiscountPrinter("Discount", order.discount()))
                .addNode(new AmountPrinter("Total Amount", order.totalAmount()));

        return head.print(new Input()).get();
    }

}