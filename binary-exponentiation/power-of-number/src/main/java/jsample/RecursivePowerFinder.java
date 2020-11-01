package jsample;

public class RecursivePowerFinder {

    public long find(int number, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return number;
        } else {
            long result = find(number, power / 2);
            if (power % 2 == 0) {
                return result * result;
            } else {
                return result * result * number;
            }
        }
    }
}
