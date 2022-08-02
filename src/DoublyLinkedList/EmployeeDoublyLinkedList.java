package DoublyLinkedList;




public class EmployeeDoublyLinkedList {


    EmployeeNode head;
    EmployeeNode tail;


      int size;


    public void addToFirst(Employee employee)
    {

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);


        if(head == null)
        {

               tail = node;

        }

        else {
                head.setPrevious(node);

        }
        head = node;
        size++;
    }



    public void addToEnd(Employee employee)
    {

        EmployeeNode node = new EmployeeNode(employee);

        if(tail==null)
        {


            head  = node;
        }


        else {


            tail.setNext(node);

            node.setPrevious(tail);
        }

        tail = node;
        size++;






    }

    public void printList()
    {

        EmployeeNode current = head;

        while(current!=null)
        {


            System.out.print(current.toString());

            System.out.print(" <=> ");
            current = current.getNext();
        }



    }



}
