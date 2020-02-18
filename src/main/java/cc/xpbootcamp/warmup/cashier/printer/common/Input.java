package cc.xpbootcamp.warmup.cashier.printer.common;

/**
 * Input:
 * @author zhangxuhai
 * @date 2020/2/18
*/
public class Input {
    private StringBuilder builder = new StringBuilder();

    Output toOutput() {
        return new Output(builder.toString());
    }

    public Input append(String s) {
        builder.append(s);
        return this;
    }
}
