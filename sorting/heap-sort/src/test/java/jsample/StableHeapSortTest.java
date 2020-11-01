package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class StableHeapSortTest {

    private StableHeapSort<Student> solution = new StableHeapSort<>();

    @Test
    public void sortTest1() {
        Student[] array = new Student[]{
                new Student("Alexa", "C"),
                new Student("Shelly", "A"),
                new Student("Bob", "A"),
                new Student("Bob", "B"),
                new Student("Shelly", "B"),
                new Student("Alexa", "A"),
                new Student("Alexa", "B")
        };
        Student[] sortedArray = new Student[]{
                new Student("Alexa", "C"),
                new Student("Alexa", "A"),
                new Student("Alexa", "B"),
                new Student("Bob", "A"),
                new Student("Bob", "B"),
                new Student("Shelly", "A"),
                new Student("Shelly", "B")
        };
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).usingFieldByFieldElementComparator().isEqualTo(sortedArray);
    }

    @Test
    public void sortTest2() {
        Student[] array = new Student[]{
                new Student("Alex", "B"),
                new Student("Alex", "A"),
                new Student("Alex", "C")
        };
        Student[] sortedArray = new Student[]{
                new Student("Alex", "B"),
                new Student("Alex", "A"),
                new Student("Alex", "C")
        };
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).usingFieldByFieldElementComparator().isEqualTo(sortedArray);
    }

    @Test
    public void sortTest3() {
        Student[] array = new Student[]{
                new Student("Martin", "C"),
                new Student("Martin", "A"),
                new Student("Martin", "B"),
                new Student("John", "B"),
                new Student("John", "A"),
                new Student("John", "C"),
                new Student("Alex", "B"),
                new Student("Alex", "A"),
                new Student("Alex", "C")
        };
        Student[] sortedArray = new Student[]{
                new Student("Alex", "B"),
                new Student("Alex", "A"),
                new Student("Alex", "C"),
                new Student("John", "B"),
                new Student("John", "A"),
                new Student("John", "C"),
                new Student("Martin", "C"),
                new Student("Martin", "A"),
                new Student("Martin", "B")
        };
        AssertionsForInterfaceTypes.assertThat(solution.sort(array)).usingFieldByFieldElementComparator().isEqualTo(sortedArray);
    }
}
