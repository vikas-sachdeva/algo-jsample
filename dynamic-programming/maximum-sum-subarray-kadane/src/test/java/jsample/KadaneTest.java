package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class KadaneTest {

    private Kadane kadane = new Kadane();

    @Test
    void findSumTest1() {
        AssertionsForInterfaceTypes.assertThat(kadane.findSum(new int[]{1, -3, 2, 1, -1})).isEqualTo(3);
    }

    @Test
    void findSumTest2() {
        AssertionsForInterfaceTypes.assertThat(kadane.findSum(new int[]{1, 3, 2, 1, 1})).isEqualTo(8);
    }

    @Test
    void findSumTest3() {
        AssertionsForInterfaceTypes.assertThat(kadane.findSum(new int[]{-1, -3, -2, -1, -1})).isEqualTo(-1);
    }

    @Test
    void findSumTest4() {
        AssertionsForInterfaceTypes.assertThat(kadane.findSum(new int[]{1, -3, 2, 0, 1, -1})).isEqualTo(3);
    }
}
