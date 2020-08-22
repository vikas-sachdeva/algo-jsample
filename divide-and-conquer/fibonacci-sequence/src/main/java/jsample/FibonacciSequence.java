package jsample;

public class FibonacciSequence {

    public long generate(int n) {
        if (n <= 1) {
            return 1;
        }
        return generate(n - 1) + generate(n - 2);
    }
}
