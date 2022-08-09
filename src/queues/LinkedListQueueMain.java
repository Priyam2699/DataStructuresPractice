package queues;

public class LinkedListQueueMain {


    public static void main(String[] args) {



        LinkedListQueue queue = new LinkedListQueue();



        queue.add(new Employee(1, "Priyam","Dua"));
        queue.add(new Employee(2, "Iqbal", "Bhullar"));
        queue.add(new Employee(3, "Gurjinder", "BHatti"));
        queue.add(new Employee(4, "Randeep", "Saini"));


        System.out.println("Before remove");

        queue.printQueue();


        queue.remove();

        System.out.println("\nAfter remove");

        queue.printQueue();










    }

}
