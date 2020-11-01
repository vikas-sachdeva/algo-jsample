package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class CycleDetectorTest {

    private CycleDetector cycleDetector = new CycleDetector();

    @Test
    public void isCycleExistTest1() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        head.getNext().setNext(new Node<>(30));
        Node<Integer> cycleStart = new Node<>(40);
        head.getNext().getNext().setNext(cycleStart);
        cycleStart.setNext(new Node<>(50));
        cycleStart.getNext().setNext(new Node<>(60));
        cycleStart.getNext().getNext().setNext(new Node<>(70));
        cycleStart.getNext().getNext().getNext().setNext(cycleStart);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.isCycleExist(head)).isTrue();
    }

    @Test
    public void isCycleExistTest2() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        head.getNext().setNext(new Node<>(30));
        Node<Integer> temp = new Node<>(40);
        head.getNext().getNext().setNext(temp);
        temp.setNext(new Node<>(50));
        temp.getNext().setNext(new Node<>(60));
        temp.getNext().getNext().setNext(new Node<>(70));
        AssertionsForInterfaceTypes.assertThat(cycleDetector.isCycleExist(head)).isFalse();
    }

    @Test
    public void isCycleExistTest3() {
        Node<Integer> head = new Node<>(10);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.isCycleExist(head)).isFalse();
    }

    @Test
    public void isCycleExistTest4() {
        Node<Integer> head = new Node<>(10);
        head.setNext(head);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.isCycleExist(head)).isTrue();
    }

    @Test
    public void isCycleExistTest5() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        AssertionsForInterfaceTypes.assertThat(cycleDetector.isCycleExist(head)).isFalse();
    }

    @Test
    public void getStartNodeOfCycleTest1() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        head.getNext().setNext(new Node<>(30));
        Node<Integer> cycleStart = new Node<>(40);
        head.getNext().getNext().setNext(cycleStart);
        cycleStart.setNext(new Node<>(50));
        cycleStart.getNext().setNext(new Node<>(60));
        cycleStart.getNext().getNext().setNext(new Node<>(70));
        cycleStart.getNext().getNext().getNext().setNext(cycleStart);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.getStartNodeOfCycle(head)).isEqualTo(cycleStart);
    }

    @Test
    public void getStartNodeOfCycleTest2() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        head.getNext().setNext(new Node<>(30));
        Node<Integer> temp = new Node<>(40);
        head.getNext().getNext().setNext(temp);
        temp.setNext(new Node<>(50));
        temp.getNext().setNext(new Node<>(60));
        temp.getNext().getNext().setNext(new Node<>(70));
        AssertionsForInterfaceTypes.assertThat(cycleDetector.getStartNodeOfCycle(head)).isNull();
    }

    @Test
    public void getStartNodeOfCycleTest3() {
        Node<Integer> head = new Node<>(10);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.getStartNodeOfCycle(head)).isNull();
    }

    @Test
    public void getStartNodeOfCycleTest4() {
        Node<Integer> head = new Node<>(10);
        head.setNext(head);
        AssertionsForInterfaceTypes.assertThat(cycleDetector.getStartNodeOfCycle(head)).isEqualTo(head);
    }

    @Test
    public void getStartNodeOfCycleTest5() {
        Node<Integer> head = new Node<>(10);
        head.setNext(new Node<>(20));
        AssertionsForInterfaceTypes.assertThat(cycleDetector.getStartNodeOfCycle(head)).isNull();
    }
}
