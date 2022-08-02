package list;

public class EmployeeLinkedList {


    private EmployeeNode head;
    private int size;

    public int getSize() {

        return size;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }


    public boolean isEmpty() {

        return head == null;

    }


    public void printList() {
        EmployeeNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print("->");
            current = current.getNext();

        }
        System.out.println("null");

    }


    public EmployeeNode removeFromFront() {

        if (isEmpty()) {


            return null;
        }

        EmployeeNode removed = head;

        head = head.getNext();

size--;
        return removed;

    }

}
