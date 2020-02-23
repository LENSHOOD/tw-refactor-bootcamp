package cc.xpbootcamp.warmup.cashier;

import cc.xpbootcamp.warmup.cashier.printer.*;
import cc.xpbootcamp.warmup.cashier.printer.common.PrintElement;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

/**
 * OrderReceipt prints the details of order as human readable format, it's including
 * item description, quantity, price and amount (with tax).
 *
 * Also, if the order contains discount, the discount amount will be print.
 */
public class OrderReceipt {
    private Order order;
    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        PrinterNode printerChainEntrance = new HeaderPrinter()
                .addNode(new NewLinePrinter())
                .addNode(new DatePrinter(order.getCreateTime().toLocalDate()))
                .addNode(new NewLinePrinter());

        order.getItemInfos().stream().map(ItemInfoPrinter::new).forEach(printerChainEntrance::addNode);

        printerChainEntrance.addNode(new SplitLinePrinter())
                .addNode(new AmountPrinter("税额", order.tax()))
                .addNode(new DiscountPrinter("折扣", order.discount()))
                .addNode(new AmountPrinter("总价", order.totalAmount()));

        return printerChainEntrance.print(PrintElement.blankPrintElement()).get();
    }

}