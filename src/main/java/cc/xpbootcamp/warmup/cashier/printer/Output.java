package cc.xpbootcamp.warmup.cashier.printer;

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

    String get() {
        return outputString;
    }
}