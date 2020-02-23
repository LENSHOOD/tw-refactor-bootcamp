package cc.xpbootcamp.warmup.cashier.printer.common;

/**
 * Input:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class PrintElement {
    private StringBuilder builder = new StringBuilder();

    private PrintElement() {
        // should do nothing
    }

    public static PrintElement blankPrintElement() {
        return new PrintElement();
    }

    PrintedMatter toOutput() {
        return new PrintedMatter(builder.toString());
    }

    public PrintElement append(String s) {
        builder.append(s);
        return this;
    }
}
