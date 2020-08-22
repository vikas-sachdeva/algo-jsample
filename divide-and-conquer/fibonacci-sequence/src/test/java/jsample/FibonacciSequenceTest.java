package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    public void generateTest1() {
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(0)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(1)).isEqualTo(1);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(2)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(3)).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(4)).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(5)).isEqualTo(8);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(6)).isEqualTo(13);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(7)).isEqualTo(21);
        AssertionsForInterfaceTypes.assertThat(fibonacciSequence.generate(8)).isEqualTo(34);
    }

    @Test
    public void generateTest2() {
        long startTime = System.currentTimeMillis();
        System.out.println("Fibonacci no at position 50 is " + fibonacciSequence.generate(50));
        System.out.println(
                "Total time in milliseconds taken in Fibonacci generation at position 50 is " + (System.currentTimeMillis() - startTime));
    }
}
