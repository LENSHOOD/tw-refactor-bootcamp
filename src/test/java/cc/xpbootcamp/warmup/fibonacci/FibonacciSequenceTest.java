package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * FibonacciSequenceTest:
 * @author zhangxuhai
 * @date 2020/2/15
*/
public class FibonacciSequenceTest {
    @Test
    public void should_return_1_1_2_3_when_generate_fibonacci_four_times() {
        FibonacciSequence fbcSeq = new FibonacciSequence();

        int first = fbcSeq.generate();
        int second = fbcSeq.generate();
        int third = fbcSeq.generate();
        int fourth = fbcSeq.generate();

        assertThat(first).isEqualTo(1);
        assertThat(second).isEqualTo(1);
        assertThat(third).isEqualTo(2);
        assertThat(fourth).isEqualTo(3);
    }

    @Test
    public void should_return_fibonacci_sequence_of_10_bit_when_get_sequence_by_10_bit() {
        FibonacciSequence fbcSeq = new FibonacciSequence();
        int tenBit = 10;

        List<Integer> fibonacciList = fbcSeq.getSequenceBy(tenBit);

        assertThat(fibonacciList).containsExactly(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
    }

    @Test
    public void should_throw_illegalArgumentException_when_getSequenceBy_param_not_greater_than_0() {
        FibonacciSequence fbcSeq = new FibonacciSequence();

        assertThatThrownBy(() -> fbcSeq.getSequenceBy(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Fibonacci sequence bit should be greater than 0.");
    }
}
