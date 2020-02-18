package cc.xpbootcamp.warmup.cashier.printer;

import cc.xpbootcamp.warmup.cashier.printer.common.Input;
import cc.xpbootcamp.warmup.cashier.printer.common.PrinterNode;

/**
 * HeaderNode:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class HeaderPrinter extends PrinterNode {
    private static final String HEADERS = "===== 老王超市，值得信赖 ======\n";

    @Override
    protected Input doPrint(Input input) {
        return input.append(HEADERS);
    }
}
