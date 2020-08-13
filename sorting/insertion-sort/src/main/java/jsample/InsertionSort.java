package jsample;

public class InsertionSort<T extends Comparable<T>> {

    public T[] sort(T[] array) {
        if (array.length <= 1) {
            return array;
        }
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
