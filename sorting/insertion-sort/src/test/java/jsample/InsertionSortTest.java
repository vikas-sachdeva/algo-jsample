package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class InsertionSortTest {

    InsertionSort<Integer> solution = new InsertionSort<>();

    @Test
    public void sortTest1() {
        Integer[] array = new Integer[]{5, 4, 1, 0};
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).containsExactly(0, 1, 4, 5);
    }

    @Test
    public void sortTest2() {
        Integer[] array = new Integer[]{4, 3, 2, 1, 0};
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).containsExactly(0, 1, 2, 3, 4);
    }

    @Test
    public void sortTest3() {
        Integer[] array = new Integer[]{11, 34, 22, 55, 66, 1, 6, 9, 0};
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).containsExactly(0, 1, 6, 9, 11, 22, 34, 55, 66);
    }

    @Test
    public void sortTest4() {
        List<Integer> inputList = new Random().ints(100).boxed().collect(Collectors.toList());
        Integer[] inputArray = new Integer[inputList.size()];
        inputList.toArray(inputArray);
        Collections.sort(inputList);
        AssertionsForInterfaceTypes.assertThat(solution.sort(inputArray)).containsExactlyElementsOf(inputList);
    }
}