package jsample;

public class MergeSort<T extends Comparable<T>> {

    public T[] sort(T[] array) {
        if (array.length <= 1) {
            return array;
        }
        Object[] temp = new Object[array.length];
        sort(array, temp, 0, array.length - 1);
        return array;
    }

    private void sort(T[] array, Object[] temp, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(array, temp, left, mid);
        sort(array, temp, mid + 1, right);
        merge(array, temp, left, right);
    }

    private void merge(T[] array, Object[] temp, int left, int right) {
        int mid = (left + right) / 2;
        int index = left;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (array[i].compareTo(array[j]) > 0) {
                temp[index] = array[j];
                j++;
            } else {
                temp[index] = array[i];
                i++;
            }
            index++;
        }
        System.arraycopy(array, i, temp, index, mid - i + 1);
        System.arraycopy(array, j, temp, index, right - j + 1);
        System.arraycopy(temp, left, array, left, right - left + 1);
    }
}