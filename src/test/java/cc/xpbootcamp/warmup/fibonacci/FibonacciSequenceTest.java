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

        long first = fbcSeq.generate();
        long second = fbcSeq.generate();
        long third = fbcSeq.generate();
        long fourth = fbcSeq.generate();

        assertThat(first).isEqualTo(1);
        assertThat(second).isEqualTo(1);
        assertThat(third).isEqualTo(2);
        assertThat(fourth).isEqualTo(3);
    }

    @Test
    public void should_return_fibonacci_sequence_of_10_bit_when_get_sequence_by_10_bit() {
        FibonacciSequence fbcSeq = new FibonacciSequence();
        int tenBit = 10;

        List<Long> fibonacciList = fbcSeq.getSequenceBy(tenBit);

        assertThat(fibonacciList).containsExactly(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L);
    }

    @Test
    public void should_throw_illegalArgumentException_when_getSequenceBy_param_not_greater_than_0() {
        FibonacciSequence fbcSeq = new FibonacciSequence();

        assertThatThrownBy(() -> fbcSeq.getSequenceBy(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Fibonacci sequence bit should be greater than 0.");
    }
    
    @Test
    public void should_get_12586269025_when_generate_to_fifty() {
        FibonacciSequence fbcSeq = new FibonacciSequence();
        int fiftyBit = 50;

        List<Long> fibonacciList = fbcSeq.getSequenceBy(fiftyBit);

        assertThat(fibonacciList.get(49)).isEqualTo(12586269025L);
    }
}
