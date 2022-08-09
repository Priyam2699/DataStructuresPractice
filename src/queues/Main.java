package queues;


public class Main {


    public static void main(String[] args) {


        ArrayQueue queue = new ArrayQueue(10);
        queue.add(new Employee(1, "Priyam", "Dua"));

        queue.add(new Employee(2, "Iqbal", "Bhullar"));

        queue.add(new Employee(3, "Gurjinder", "Bhatti"));

        queue.add(new Employee(4, "Randeep", "Saini"));


        System.out.println("Before remove");

        queue.printQueue();

        queue.remove();

        System.out.println("After remove");


        queue.printQueue();

        System.out.println("Peeked node is"+queue.peek());


    }


}
