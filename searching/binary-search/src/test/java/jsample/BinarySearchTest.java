package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BinarySearchTest {

    private BinarySearch<Integer> binarySearch = new BinarySearch<>();

    @Test
    public void searchTest1() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, 3)).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, 10)).isEqualTo(9);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, 0)).isEqualTo(-1);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, 11)).isEqualTo(-1);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, 1)).isEqualTo(0);
    }

    @Test
    public void searchTest2() {
        List<Integer> inputList = new Random().ints(100).boxed().collect(Collectors.toList());
        Collections.sort(inputList);
        Integer[] array = new Integer[inputList.size()];
        inputList.toArray(array);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, inputList.get(3))).isEqualTo(3);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, inputList.get(10))).isEqualTo(10);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, inputList.get(0))).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(binarySearch.search(array, inputList.get(99))).isEqualTo(99);
    }
}
