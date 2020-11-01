package jsample;

public class FibonacciSequence {

    public long generate(int n) {
        long[] temp = new long[n + 1];
        if (n <= 1) {
            return 1;
        }
        temp[0] = 1;
        temp[1] = 1;
        return generate(n, temp);
    }

    private long generate(int n, long[] temp) {
        if (temp[n] == 0) {
            System.out.println("hello n " + n);
            temp[n] = generate(n - 1, temp) + generate(n - 2, temp);
        }
        return temp[n];
    }
}