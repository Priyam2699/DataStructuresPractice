package ListExample;

public class EmployeeNode {


    Employee employee;
    EmployeeNode node;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return
                "employee=" + employee +
                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNode() {
        return node;
    }

    public void setNode(EmployeeNode node) {
        this.node = node;
    }
}
