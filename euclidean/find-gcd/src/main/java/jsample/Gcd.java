package jsample;

public class Gcd {

    public int calculate(int a, int b) {
        int large = a > b ? a : b;
        int small = a < b ? a : b;
        return calculateEuclideanGcd(large, small);
    }

    private int calculateEuclideanGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return calculateEuclideanGcd(b, a % b);
    }
}