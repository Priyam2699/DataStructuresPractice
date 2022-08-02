package list;

public class EmployeeNode {

       private Employee employee;
       private EmployeeNode next;

       @Override
       public String toString() {
              return employee.toString();
       }

       public EmployeeNode(Employee employee)
       {
              this.employee = employee;
       }

       public Employee getEmployee() {
              return employee;
       }

       public void setEmployee(Employee employee) {
              this.employee = employee;
       }

       public EmployeeNode getNext() {
              return next;
       }

       public void setNext(EmployeeNode next) {
              this.next = next;
       }
}
