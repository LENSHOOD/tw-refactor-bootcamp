package cc.xpbootcamp.warmup.cashier.printer.common;

/**
 * Output:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class PrintedMatter {
    static final PrintedMatter EMPTY = new PrintedMatter("");
    private String outputString;

    PrintedMatter(String outputString) {
        this.outputString = outputString;
    }

    public String get() {
        return outputString;
    }
}
