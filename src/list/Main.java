package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Employee> list = new Vector();
        list.add(new Employee("Priyam", "Dua", 1));
        list.add(new Employee("Iqbal", "Bhullar", 455));
        list.add(new Employee("Gurjinder", "Bhatti", 784));
        list.add(new Employee("Randeep", "Saini", 922));
        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.isEmpty());
        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.size());
        list.add(4, new Employee("Ajay", "Maheshwari", 8115));
        list.forEach(employee -> System.out.println(employee));
        System.out.print("\nxxxxxxxxxxxxxxxxxxxxxxxx\n");
        Employee[] empObjects = list.toArray(new Employee[list.size()]);

        for (Employee emp : empObjects) {
            System.out.println(emp);
        }


        boolean a = list.contains(new Employee("Priyam", "Dua", 1));

        System.out.println(list.indexOf(new Employee("Priyam", "Dua", 1)));

        System.out.println(a);

        list.remove(2);

        System.out.println(list);


    }


}
