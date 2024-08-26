//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.id = 1;
        employee.id = 2;

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.List();
        customerManager.Add();

    }
}