package jsample;

public class Kadane {

    public int findSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(currentSum + array[i], array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
