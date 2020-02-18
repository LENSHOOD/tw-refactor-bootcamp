package cc.xpbootcamp.warmup.cashier.printer;

/**
 * HeaderNode:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class HeaderPrinter extends PrinterNode {
    private static final String HEADERS = "======Printing Orders======\n";

    @Override
    protected Input doPrint(Input input) {
        return input.append(HEADERS);
    }
}
