package DoublyLinkedList;



public class Main {

    public static void main(String[] args) {


        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        Employee priyam = new Employee("Priyam", "Dua", 1);
        Employee iqbal = new Employee("Iqbal", "Bhullar", 455);
        Employee gurjinder = new Employee("Gurjinder", "Bhatti", 784);
        Employee randeep = new Employee("Randeep", "Saini", 922);


        list.addToFirst(priyam);
        list.addToFirst(iqbal);
        list.addToFirst(gurjinder);
        list.addToFirst(randeep);

        list.printList();

        System.out.println(list.size);


        Employee meshi = new Employee("Ajay", "Meshi", 748);

        list.addToEnd(meshi);

        list.printList();



    }


}
