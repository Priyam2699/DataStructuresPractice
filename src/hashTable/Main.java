package hashTable;

public class Main {


    public static void main(String[] args) {


        Employee priyam = new Employee(1, "Priyam", "Dua");
        Employee iqbal = new Employee(2, "Iqbal", "Bhullar");
        Employee bhatti = new Employee(3, "Bhatti", "Gurjinder");
        Employee saini = new Employee(4, "Randeep", "Saini");


        SimpleHashTable hT = new SimpleHashTable();

        hT.put("Dua", priyam);
        hT.put("Bhullar", iqbal);
        hT.put("Gurjinder", bhatti);
        hT.put("Saini", saini);
        hT.put("Abc", new Employee(5, "dvksd", "Abc"));

        hT.printHashTable();

        System.out.println("Retrieve key Saini: " + hT.get("Saini"));


    }


}
