package jsample;

public class HeapSort<T extends Comparable<T>> {

    private int nextIndex = 0;

    private Object[] heap;

    public T[] sort(T[] array) {
        if (array.length < 2) {
            return array;
        }
        heap = new Object[array.length];
        for (T data : array) {
            insert(data);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = extractMin();
        }
        return array;
    }

    private T extractMin() {
        T element = (T) heap[0];
        heap[0] = heap[nextIndex - 1];
        nextIndex--;
        heapifyDown(0);
        return element;
    }

    private void heapifyDown(int currentIndex) {
        int leftChildIndex = currentIndex * 2 + 1;
        if (leftChildIndex >= nextIndex) {
            return;
        }
        int rightChildIndex = currentIndex * 2 + 2;
        int smallestChildIndex = leftChildIndex;
        if (rightChildIndex < nextIndex && ((T) heap[leftChildIndex]).compareTo((T) heap[rightChildIndex]) > 0) {
            smallestChildIndex = rightChildIndex;
        }
        if (((T) heap[currentIndex]).compareTo((T) heap[smallestChildIndex]) > 0) {
            Object data = heap[currentIndex];
            heap[currentIndex] = heap[smallestChildIndex];
            heap[smallestChildIndex] = data;
            heapifyDown(smallestChildIndex);
        }
    }

    private void insert(T data) {
        heap[nextIndex] = data;
        heapifyUp(nextIndex);
        nextIndex++;
    }

    private void heapifyUp(int currentIndex) {
        if (currentIndex == 0) {
            return;
        }
        int parentIndex = (currentIndex - 1) / 2;
        if (((T) heap[parentIndex]).compareTo((T) heap[currentIndex]) > 0) {
            Object data = heap[parentIndex];
            heap[parentIndex] = heap[currentIndex];
            heap[currentIndex] = data;
            heapifyUp(parentIndex);
        }
    }

}
