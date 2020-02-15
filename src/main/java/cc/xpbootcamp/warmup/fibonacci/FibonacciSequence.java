package cc.xpbootcamp.warmup.fibonacci;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public List<Integer> getSequenceBy(int bit) {
        if (bit <= 0) {
            throw new IllegalArgumentException("Fibonacci sequence bit should be greater than 0.");
        }

        return IntStream.range(0, bit).mapToObj(i -> generate()).collect(Collectors.toList());
    }
}
