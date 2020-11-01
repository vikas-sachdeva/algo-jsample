package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HeapSortTest {

    private HeapSort<Integer> solution1 = new HeapSort<>();

    private HeapSortWithoutExtraSpace1<Integer> solution2 = new HeapSortWithoutExtraSpace1<>();

    private HeapSortWithoutExtraSpace2<Integer> solution3 = new HeapSortWithoutExtraSpace2<>();

    @Test
    public void sortTest1() {
        Integer[] array = new Integer[]{5, 4, 1, 0};
        AssertionsForInterfaceTypes.assertThat(solution1.sort(array)).containsExactly(0, 1, 4, 5);
        AssertionsForInterfaceTypes.assertThat(solution2.sort(array)).containsExactly(0, 1, 4, 5);
        AssertionsForInterfaceTypes.assertThat(solution3.sort(array)).containsExactly(0, 1, 4, 5);
    }

    @Test
    public void sortTest2() {
        List<Integer> inputList = new Random().ints(100).boxed().collect(Collectors.toList());
        Integer[] inputArray = new Integer[inputList.size()];
        inputList.toArray(inputArray);
        Collections.sort(inputList);
        AssertionsForInterfaceTypes.assertThat(solution1.sort(inputArray)).containsExactlyElementsOf(inputList);
        AssertionsForInterfaceTypes.assertThat(solution2.sort(inputArray)).containsExactlyElementsOf(inputList);
        AssertionsForInterfaceTypes.assertThat(solution3.sort(inputArray)).containsExactlyElementsOf(inputList);
    }

    @Test
    public void sortTest3() {
        Integer[] array = new Integer[]{8, 9, 10, 11, 12};
        AssertionsForInterfaceTypes.assertThat(solution1.sort(array)).containsExactly(8, 9, 10, 11, 12);
        AssertionsForInterfaceTypes.assertThat(solution2.sort(array)).containsExactly(8, 9, 10, 11, 12);
        AssertionsForInterfaceTypes.assertThat(solution3.sort(array)).containsExactly(8, 9, 10, 11, 12);
    }
}
