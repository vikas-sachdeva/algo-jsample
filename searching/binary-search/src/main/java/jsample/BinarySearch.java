package jsample;

public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] array, T element) {
        if (array.length == 0) {
            return -1;
        }
        return search(0, array.length - 1, array, element);
    }

    private int search(int low, int high, T[] array, T element) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid].compareTo(element) > 0) {
            return search(low, mid - 1, array, element);
        } else if (array[mid].compareTo(element) < 0) {
            return search(mid + 1, high, array, element);
        } else {
            return mid;
        }
    }
}
