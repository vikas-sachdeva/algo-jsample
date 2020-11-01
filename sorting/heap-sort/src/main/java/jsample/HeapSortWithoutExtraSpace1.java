package jsample;

public class HeapSortWithoutExtraSpace1<T extends Comparable<T>> {

    public T[] sort(T[] array) {
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            heapifyUp(array, i);
        }
        for (int i = array.length - 1; i > 0; i--) {
            putMaxAtTheEnd(array, i);
        }
        return array;
    }

    private void putMaxAtTheEnd(T[] array, int endIndex) {
        T element = array[0];
        array[0] = array[endIndex];
        array[endIndex] = element;
        heapifyDown(array, 0, endIndex);
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

    private void heapifyUp(T[] array, int currentIndex) {
        if (currentIndex == 0) {
            return;
        }
        int parentIndex = (currentIndex - 1) / 2;
        if ((array[parentIndex]).compareTo(array[currentIndex]) < 0) {
            T data = array[parentIndex];
            array[parentIndex] = array[currentIndex];
            array[currentIndex] = data;
            heapifyUp(array, parentIndex);
        }
    }
}
