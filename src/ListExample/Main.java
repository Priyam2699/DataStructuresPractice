package ListExample;

public class Main {


    public static void main(String[] args) {



       EmployeeLinkedList newListEmployeeLinkedList  = new EmployeeLinkedList();

       Employee o1 = new Employee(1,"Priyam","Dua");
        Employee o2 = new Employee(2,"Iqbal","Bhullar");

        newListEmployeeLinkedList.addToFirst(o1);
        newListEmployeeLinkedList.addToFirst(o2);

         newListEmployeeLinkedList.printList();






    }


}
