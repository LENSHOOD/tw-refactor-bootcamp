package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.ItemInfo;
import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

import java.math.RoundingMode;

/**
 * ItemPrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class ItemInfoPrinter extends PrinterNode {
    private static final int FLOAT_SCALE = 2;
    private ItemInfo itemInfo;

    public ItemInfoPrinter(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @Override
    protected Input doPrint(Input input) {
        return input
                .append(itemInfo.getDescription())
                .append(", ")
                .append(itemInfo.getPrice().setScale(FLOAT_SCALE, RoundingMode.HALF_UP).toString())
                .append(" x ")
                .append(Integer.toString(itemInfo.getQuantity()))
                .append(", ")
                .append(itemInfo.totalAmount().setScale(FLOAT_SCALE, RoundingMode.HALF_UP).toString())
                .append("\n");
    }
}
