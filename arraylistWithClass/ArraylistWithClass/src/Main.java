import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer metin = new Customer(1,"Metin", "Yurduseven");
        customers.add(metin);
        customers.add(new Customer(2,"Ali","Yurduseven"));
        customers.add(new Customer(3,"Nuh", "Yurduseven"));

        customers.remove(metin);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}