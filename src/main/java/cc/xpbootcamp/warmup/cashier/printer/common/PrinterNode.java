package cc.xpbootcamp.warmup.cashier.printer.common;

import java.util.Objects;

/**
 * PrinterNode:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public abstract class PrinterNode {
    private PrinterNode next;

    public PrinterNode addNode(PrinterNode node) {
        if (Objects.isNull(next)) {
            next = node;
        } else {
            next.addNode(node);
        }

        return this;
    }

    public PrintedMatter print(PrintElement printElement) {
        if (Objects.isNull(printElement)) {
            return PrintedMatter.EMPTY;
        }

        PrintElement done = doPrint(printElement);
        return Objects.isNull(next) ? done.toOutput() : next.print(done);
    }

    protected abstract PrintElement doPrint(PrintElement printElement);
}
