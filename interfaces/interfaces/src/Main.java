//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new OracleCustomerDal();

        /*CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();*/

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}