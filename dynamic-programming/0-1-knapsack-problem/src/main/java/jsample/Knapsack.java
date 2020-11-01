package jsample;

public class Knapsack {

    public int computeMaxValue(int[] weights, int[] values, int totalWeight) {
        return getMaxValue(weights, values, weights.length - 1, totalWeight);
    }

    private int getMaxValue(int[] weights, int[] values, int currentItemIndex, int totalWeight) {
        if (totalWeight <= 0) {
            return 0;
        }
        if (currentItemIndex == 0) {
            return weights[currentItemIndex] > totalWeight ? 0 : values[currentItemIndex];
        } else if (weights[currentItemIndex] > totalWeight) {
            return getMaxValue(weights, values, currentItemIndex - 1, totalWeight);
        } else {
            int nthItemIncludedValue =
                    values[currentItemIndex] + getMaxValue(weights, values, currentItemIndex - 1, totalWeight - weights[currentItemIndex]);
            int nthItemNotIncludedValue = getMaxValue(weights, values, currentItemIndex - 1, totalWeight);
            return Math.max(nthItemIncludedValue, nthItemNotIncludedValue);
        }
    }
}
