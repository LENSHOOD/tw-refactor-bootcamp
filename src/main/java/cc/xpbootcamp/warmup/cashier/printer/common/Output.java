package cc.xpbootcamp.warmup.cashier.printer.common;

/**
 * Output:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class Output {
    static final Output EMPTY = new Output("");
    private String outputString;

    Output(String outputString) {
        this.outputString = outputString;
    }

    public String get() {
        return outputString;
    }
}
