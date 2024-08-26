import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap = " + manager.getBalance());
        manager.withdraw(90);
        System.out.println("Hesap = " + manager.getBalance());
        manager.withdraw(20);
        System.out.println("Hesap = " + manager.getBalance());

        // OR
//        try{
//            manager.withdraw(90);
//        } catch (Exception exception){
//            System.out.println(exception.getMessage());
//        }
//        System.out.println("Hesap= " + manager.getBalance());
//
//        try{
//            manager.withdraw(20);
//        } catch (Exception exception){
//            System.out.println(exception.getMessage());
//        }
//        System.out.println("Hesap= " + manager.getBalance());
//


    }
}