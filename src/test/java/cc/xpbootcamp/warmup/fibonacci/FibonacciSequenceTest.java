package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * FibonacciSequenceTest:
 * @author zhangxuhai
 * @date 2020/2/15
*/
public class FibonacciSequenceTest {
    @Test
    public void should_get_sum_5_when_given_two_numbers_2_3() {
        FibonacciSequence fbcSeq = new FibonacciSequence();

        int sum = fbcSeq.calculateSum(2, 3);

        assertThat(sum).isEqualTo(5);
    }

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


}
