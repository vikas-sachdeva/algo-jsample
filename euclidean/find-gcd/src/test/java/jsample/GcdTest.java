package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class GcdTest {

    private Gcd gcd = new Gcd();

    @Test
    public void calculateTest1() {
        AssertionsForInterfaceTypes.assertThat(gcd.calculate(10, 5)).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(gcd.calculate(10, 25)).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(gcd.calculate(10, 14)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(gcd.calculate(1024, 3125)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(gcd.calculate(32424, 989870)).isEqualTo(14);
    }
}
