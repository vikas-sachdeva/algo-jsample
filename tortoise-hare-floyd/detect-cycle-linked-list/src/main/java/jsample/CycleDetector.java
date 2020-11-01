package jsample;

public class CycleDetector {

    public <T> boolean isCycleExist(Node<T> head) {
        Node<T> hare = checkIfCycleExistAndGetHareNode(head);
        return hare == null ? false : true;
    }

    private <T> Node<T> checkIfCycleExistAndGetHareNode(Node<T> head) {
        if (head == null) {
            return null;
        }
        Node<T> tortoise = head;
        Node<T> hare = head.getNext();
        while (hare != null && hare.getNext() != null) {
            if (tortoise.equals(hare)) {
                break;
            } else {
                tortoise = tortoise.getNext();
                hare = hare.getNext().getNext();
            }
        }
        return (hare == null || hare.getNext() == null) ? null : hare;
    }

    public <T> Node<T> getStartNodeOfCycle(Node<T> head) {
        Node<T> hare = checkIfCycleExistAndGetHareNode(head);
        if (hare != null) {
            Node<T> tortoise = head;
            hare = hare.getNext();
            while (!tortoise.equals(hare)) {
                tortoise = tortoise.getNext();
                hare = hare.getNext();
            }
        }
        return hare;
    }
}
