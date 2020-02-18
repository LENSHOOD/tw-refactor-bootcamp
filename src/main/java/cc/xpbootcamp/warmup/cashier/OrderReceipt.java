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
                .addNode(new NewLinePrinter())
                .addNode(new DatePrinter(order.getCreateTime().toLocalDate()))
                .addNode(new NewLinePrinter());

        order.getItemInfos().stream().map(ItemInfoPrinter::new).forEach(head::addNode);

        head.addNode(new SplitLinePrinter())
                .addNode(new AmountPrinter("税额", order.tax()))
                .addNode(new DiscountPrinter("折扣", order.discount()))
                .addNode(new AmountPrinter("总价", order.totalAmount()));

        return head.print(new Input()).get();
    }

}