package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class PowerFinderTest {

    private RecursivePowerFinder recursivePowerFinder = new RecursivePowerFinder();

    @Test
    void findTest1() {
        AssertionsForInterfaceTypes.assertThat(recursivePowerFinder.find(5, 0)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(recursivePowerFinder.find(5, 1)).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(recursivePowerFinder.find(5, 2)).isEqualTo(25);
        AssertionsForInterfaceTypes.assertThat(recursivePowerFinder.find(12, 2)).isEqualTo(144);
        AssertionsForInterfaceTypes.assertThat(recursivePowerFinder.find(23, 12)).isEqualTo(21914624432020321L);
    }

}
