package cc.xpbootcamp.warmup.cashier.printer;

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

    Input append(String s) {
        builder.append(s);
        return this;
    }
}
