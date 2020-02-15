package cc.xpbootcamp.warmup.fibonacci;

/**
 * FibonacciSequence:
 * @author zhangxuhai
 * @date 2020/2/15
*/
public class FibonacciSequence {
    private int previous;
    private int current;

    int calculateSum(int first, int second) {
        return first + second;
    }

    int generate() {
        if (current == 0) {
            current = 1;
            return current;
        }

        int tmp = previous + current;
        previous = current;
        current = tmp;

        return current;
    }
}
