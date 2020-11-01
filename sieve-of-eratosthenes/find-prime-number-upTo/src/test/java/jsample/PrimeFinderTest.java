package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class PrimeFinderTest {

    private PrimeFinder primeFinder = new PrimeFinder();

    @Test
    public void findUpToTest1() {
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(2)).containsExactly(2);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(3)).containsExactly(2, 3);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(4)).containsExactly(2, 3);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(5)).containsExactly(2, 3, 5);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(6)).containsExactly(2, 3, 5);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(7)).containsExactly(2, 3, 5, 7);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(8)).containsExactly(2, 3, 5, 7);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(9)).containsExactly(2, 3, 5, 7);
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(10)).containsExactly(2, 3, 5, 7);
    }

    @Test
    public void findUpToTest2() {
        AssertionsForInterfaceTypes.assertThat(primeFinder.findUpTo(50)).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    }
}