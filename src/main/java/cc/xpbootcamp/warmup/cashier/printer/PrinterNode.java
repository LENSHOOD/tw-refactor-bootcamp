package cc.xpbootcamp.warmup.cashier.printer;

import java.util.Objects;

/**
 * PrinterNode:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public abstract class PrinterNode {
    private PrinterNode next;

    public PrinterNode addNode(PrinterNode next) {
        if (Objects.isNull(this.next)) {
            this.next = next;
        } else {
            this.next.addNode(next);
        }

        return this;
    }

    public Output print(Input input) {
        if (Objects.isNull(input)) {
            return Output.EMPTY;
        }

        Input done = doPrint(input);
        return Objects.isNull(next) ? done.toOutput() : next.print(done);
    }

    protected abstract Input doPrint(Input input);
}
