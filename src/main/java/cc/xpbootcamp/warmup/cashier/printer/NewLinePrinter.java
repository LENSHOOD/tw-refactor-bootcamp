package cc.xpbootcamp.warmup.cashier.printer;

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
