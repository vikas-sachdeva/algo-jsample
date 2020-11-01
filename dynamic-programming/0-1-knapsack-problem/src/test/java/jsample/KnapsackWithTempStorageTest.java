package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class KnapsackWithTempStorageTest {

    private KnapsackWithTempStorage knapsack = new KnapsackWithTempStorage();

    @Test
    public void computeMaxValueTest1() {
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{2, 3, 1}, new int[]{4, 1, 3}, 7)).isEqualTo(8);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{10, 20, 30}, new int[]{60, 100, 120}, 50)).isEqualTo(220);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{1, 1, 1}, new int[]{10, 20, 30}, 2)).isEqualTo(50);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{1, 1, 1}, new int[]{10, 20, 30}, 0)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{2, 3, 1}, new int[]{4, 1, 3}, 2)).isEqualTo(4);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{2, 3, 1}, new int[]{4, 1, 3}, 1)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{2, 3, 3}, new int[]{4, 1, 3}, 1)).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(knapsack.computeMaxValue(new int[]{2, 3, 3}, new int[]{4, 1, 3}, 2)).isEqualTo(4);
    }
}
