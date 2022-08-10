package hashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapJDKMain {


    public static void main(String[] args) {


        Employee priyam = new Employee(1, "Priyam", "Dua");
        Employee iqbal = new Employee(2, "Iqbal", "Bhullar");
        Employee bhatti = new Employee(3, "Bhatti", "Gurjinder");
        Employee saini = new Employee(4, "Randeep", "Saini");


        Map<String, Employee> map = new HashMap<>();

        map.put("Dua", priyam);
        map.put("Bhullar", iqbal);
        map.put("Gurjinder", bhatti);
        map.put("Saini", saini);

        Employee emp = map.putIfAbsent("Dua", new Employee(6, "Malika", "Dua"));

        System.out.println(emp);


        Iterator<Employee> itr = map.values().iterator();


        //  while(itr.hasNext())
        // {

        //      System.out.println(itr.next());

        //  }

        map.forEach((k, v) -> System.out.println(k + ": " + v));



        System.out.println(map.containsKey("Saini"));

        System.out.println(map.containsValue(saini));


        System.out.println(map.get("Dua"));
        System.out.println(map.getOrDefault("someone",priyam));








    }


}
