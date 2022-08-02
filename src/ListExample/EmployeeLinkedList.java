package ListExample;



public class EmployeeLinkedList {


    EmployeeNode head;



    public void addToFirst(Employee employee)
    {

        EmployeeNode employeeNode1 = new EmployeeNode(employee);
        employeeNode1.setNode(head);
        head = employeeNode1;
    }


    public void printList()
    {

        EmployeeNode current = head;

        while(current!=null)
        {


            System.out.println(current.toString());
            current = current.getNode();
        }

    }



}
