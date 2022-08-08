package stacks;

import java.util.LinkedList;

public class LinkedListStack {



       private LinkedList<Employee> stack  ;


        public LinkedListStack()
        {
            stack = new LinkedList<>();
        }


        public void push(Employee emp)
        {

            stack.add(emp);


        }



        public Employee pop()
        {


            Employee e = stack.getLast();

            stack.removeLast();

            return e;


        }


        public Employee peek()
        {

            return stack.getLast();



        }



        public void printStack()
        {

            for(int i=0; i<stack.size(); i++)
            {

                System.out.println(stack.get(stack.size()-(i+1)));

            }

        }


    public int size()
    {


        return stack.size();
    }


















}
