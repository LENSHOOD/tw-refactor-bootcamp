package cc.xpbootcamp.warmup.fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertThat(sum).isEqualTo(5);
    }


}
