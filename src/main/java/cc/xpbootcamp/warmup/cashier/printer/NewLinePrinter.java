package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

/**
 * NewLinePrinter:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class NewLinePrinter extends PrinterNode {
    @Override
    protected Input doPrint(Input input) {
        return input.append("\n");
    }
}
