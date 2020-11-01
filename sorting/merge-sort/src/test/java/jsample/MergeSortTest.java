package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MergeSortTest {

    private MergeSort<Integer> solution = new MergeSort<>();

    @Test
    public void sortTest1() {
        Integer[] array = new Integer[]{5, 4, 1, 0};
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).containsExactly(0, 1, 4, 5);
    }

    @Test
    public void sortTest2() {
        List<Integer> inputList = new Random().ints(100).boxed().collect(Collectors.toList());
        Integer[] inputArray = new Integer[inputList.size()];
        inputList.toArray(inputArray);
        Collections.sort(inputList);
        AssertionsForInterfaceTypes.assertThat(solution.sort(inputArray)).containsExactlyElementsOf(inputList);
    }
}