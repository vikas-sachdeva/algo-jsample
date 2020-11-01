package jsample;

public class KnapsackWithTempStorage {

    public int computeMaxValue(int[] weights, int[] values, int totalWeight) {
        int[][] temp = new int[weights.length][totalWeight + 1];
        return getMaxValue(weights, values, weights.length - 1, totalWeight, temp);
    }

    private int getMaxValue(int[] weights, int[] values, int currentItemIndex, int totalWeight, int[][] temp) {
        if (totalWeight <= 0) {
            return 0;
        }
        if (currentItemIndex == 0) {
            return weights[currentItemIndex] > totalWeight ? 0 : values[currentItemIndex];
        } else if (weights[currentItemIndex] > totalWeight) {
            return getStoredValue(weights, values, currentItemIndex - 1, totalWeight, temp);
        } else {
            int nthItemIncludedValue =
                    values[currentItemIndex] +
                    getStoredValue(weights, values, currentItemIndex - 1, totalWeight - weights[currentItemIndex], temp);
            int nthItemNotIncludedValue = getStoredValue(weights, values, currentItemIndex - 1, totalWeight, temp);
            temp[currentItemIndex][totalWeight] = Math.max(nthItemIncludedValue, nthItemNotIncludedValue);
            return temp[currentItemIndex][totalWeight];
        }
    }

    private int getStoredValue(int[] weights, int[] values, int index, int weight, int[][] temp) {
        if (temp[index][weight] == 0) {
            temp[index][weight] = getMaxValue(weights, values, index, weight, temp);
        }
        return temp[index][weight];
    }
}
