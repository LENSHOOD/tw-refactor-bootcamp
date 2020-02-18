package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.ItemInfo;

/**
 * ItemPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class ItemInfoPrinter extends PrinterNode {
    private ItemInfo itemInfo;

    public ItemInfoPrinter(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @Override
    protected Input doPrint(Input input) {
        return input
                .append(itemInfo.getDescription())
                .append(", ")
                .append(String.format("%.2f", itemInfo.getPrice()))
                .append(" x ")
                .append(Integer.toString(itemInfo.getQuantity()))
                .append(", ")
                .append(String.format("%.2f", itemInfo.totalAmount()))
                .append("\n");
    }
}
