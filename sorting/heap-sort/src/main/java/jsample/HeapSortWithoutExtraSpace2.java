package jsample;

public class HeapSortWithoutExtraSpace2<T extends Comparable<T>> {

    public T[] sort(T[] array) {
        if (array.length < 2) {
            return array;
        }
        convertHeapIntoMaxHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            putMaxAtTheEnd(array, i);
        }
        return array;
    }

    private void convertHeapIntoMaxHeap(T[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapifyDown(array, i, array.length);
        }
    }

    private T putMaxAtTheEnd(T[] array, int endIndex) {
        T element = array[0];
        array[0] = array[endIndex];
        array[endIndex] = element;
        heapifyDown(array, 0, endIndex );
        return element;
    }

    private void heapifyDown(T[] array, int currentIndex, int heapSize) {
        int leftChildIndex = currentIndex * 2 + 1;
        if (leftChildIndex >= heapSize) {
            return;
        }
        int rightChildIndex = currentIndex * 2 + 2;
        int largestChildIndex = leftChildIndex;
        if (rightChildIndex < heapSize && (array[leftChildIndex]).compareTo(array[rightChildIndex]) < 0) {
            largestChildIndex = rightChildIndex;
        }
        if ((array[currentIndex]).compareTo(array[largestChildIndex]) < 0) {
            T temp = array[currentIndex];
            array[currentIndex] = array[largestChildIndex];
            array[largestChildIndex] = temp;
            heapifyDown(array, largestChildIndex, heapSize);
        }
    }
}
