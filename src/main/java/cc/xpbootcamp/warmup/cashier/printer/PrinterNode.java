package cc.xpbootcamp.warmup.cashier.printer;

import java.util.Objects;

/**
 * PrinterNode:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public abstract class PrinterNode {
    protected PrinterNode next;

    public void setNext(PrinterNode next) {
        this.next = next;
    }

    Output print(Input input) {
        if (Objects.isNull(input)) {
            return Output.EMPTY;
        }

        Input done = doPrint(input);
        return Objects.isNull(next) ? done.toOutput() : next.print(done);
    }

    protected abstract Input doPrint(Input input);
}
