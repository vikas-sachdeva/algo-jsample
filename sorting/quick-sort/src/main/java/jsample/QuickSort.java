package jsample;

public class QuickSort<T extends Comparable<T>> {

    public T[] sort(T[] array) {
        if (array.length <= 1) {
            return array;
        }
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(T[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(array, left, right);
        sort(array, left, pivotIndex - 1);
        sort(array, pivotIndex + 1, right);
    }

    private int partition(T[] array, int left, int right) {
        T pivot = array[right];
        int i = left;
        int smallerElementIndex = left;
        while (i < right) {
            if (array[i].compareTo(pivot) < 0) {
                if (smallerElementIndex != i) {
                    swap(array, smallerElementIndex, i);
                }
                smallerElementIndex++;
            }
            i++;
        }
        if (smallerElementIndex != right) {
            swap(array, smallerElementIndex, right);
        }
        return smallerElementIndex;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}