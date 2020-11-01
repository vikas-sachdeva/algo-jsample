package jsample;

import java.util.HashMap;
import java.util.Map;

public class StableHeapSort<T extends Comparable<T>> {

    private Map<T, Integer> studentIndexMap = new HashMap<>();

    public T[] sort(T[] array) {
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            studentIndexMap.put(array[i], i);
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

    private void putMaxAtTheEnd(T[] array, int endIndex) {
        swap(array, 0, endIndex);
        heapifyDown(array, 0, endIndex);
    }

    private void heapifyDown(T[] array, int currentIndex, int heapSize) {
        int leftChildIndex = currentIndex * 2 + 1;
        if (leftChildIndex >= heapSize) {
            return;
        }
        int rightChildIndex = currentIndex * 2 + 2;
        int largestChildIndex = leftChildIndex;
        if (rightChildIndex < heapSize) {
            if (array[leftChildIndex].compareTo(array[rightChildIndex]) < 0) {
                largestChildIndex = rightChildIndex;
            } else if (array[leftChildIndex].compareTo(array[rightChildIndex]) == 0) {
                if (studentIndexMap.get(array[leftChildIndex]).compareTo(studentIndexMap.get(array[rightChildIndex])) < 0) {
                    largestChildIndex = rightChildIndex;
                }
            }
        }
        if (array[currentIndex].compareTo(array[largestChildIndex]) < 0) {
            swap(array, currentIndex, largestChildIndex);
            heapifyDown(array, largestChildIndex, heapSize);
        } else if (array[currentIndex].compareTo(array[largestChildIndex]) == 0) {
            if (studentIndexMap.get(array[largestChildIndex]).compareTo(studentIndexMap.get(array[currentIndex])) > 0) {
                swap(array, currentIndex, largestChildIndex);
                heapifyDown(array, largestChildIndex, heapSize);
            }
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}