package JdkLinkedList;

import DoublyLinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {


        Employee priyam = new Employee("Priyam", "Dua", 1);
        Employee iqbal = new Employee("Iqbal", "Bhullar", 455);
        Employee gurjinder = new Employee("Gurjinder", "Bhatti", 784);
        Employee randeep = new Employee("Randeep", "Saini", 922);

        LinkedList<Employee> list  = new LinkedList<>();


        list.addFirst(priyam);
        list.addFirst(iqbal);
        list.addFirst(gurjinder);


        Iterator itr = list.iterator();

        while(itr.hasNext())
        {

         System.out.print(itr.next());

        }

            System.out.print("\n");
        for(Employee emp: list)
        {

            System.out.print(emp);

        }

        System.out.print("\n");

        list.forEach(System.out::print);


       Employee bill = new Employee("Bill","Hader",4548);



       list.addLast(bill);

       list.forEach(System.out:: print);

       list.removeFirst();


       list.removeLast();

       System.out.println("/n");

        list.forEach(System.out:: print);








    }


}
