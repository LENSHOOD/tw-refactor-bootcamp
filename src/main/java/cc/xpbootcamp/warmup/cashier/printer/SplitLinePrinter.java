package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

/**
 * SplitLinePrinter:
 *
 * @author zhangxuhai
 * @date 2020/2/18
 */
public class SplitLinePrinter extends PrinterNode {
    private static final String SPILT_LINE ="-----------------------------------\n";

    @Override
    protected Input doPrint(Input input) {
        return input.append(SPILT_LINE);
    }
}
