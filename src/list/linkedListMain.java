package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class linkedListMain {


    public static void main(String[] args) {


        Employee priyam = new Employee("Priyam", "Dua", 1);
        Employee iqbal = new Employee("Iqbal", "Bhullar", 455);
        Employee gurjinder = new Employee("Gurjinder", "Bhatti", 784);
        Employee randeep = new Employee("Randeep", "Saini", 922);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(priyam);
        list.addToFront(iqbal);
        list.addToFront(gurjinder);
        list.addToFront(randeep);

        list.printList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        System.out.println(list.getSize());


        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());


        list.printList();

    }
}
