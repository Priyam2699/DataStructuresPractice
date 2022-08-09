package queues;

import stacks.LinkedListStack;

import java.util.LinkedList;

public class LinkedListQueue {

    LinkedList<Employee> queue;


    public LinkedListQueue() {

        queue = new LinkedList<>();


    }


    public void add(Employee emp) {


        queue.addLast(emp);


    }



    public Employee remove()
    {

        Employee removed = queue.getFirst();

        queue.removeFirst();


        return removed;



    }



    public Employee peek()
    {
        Employee removed = queue.getFirst();




        return removed;


    }



    public void printQueue()
    {


        for(Employee emp: queue)
        {

            System.out.print(emp+" ");

        }



    }






}
