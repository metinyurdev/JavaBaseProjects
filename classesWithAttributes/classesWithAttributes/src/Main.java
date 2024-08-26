//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Hp Laptop", 10000,3);

        //Product product = new Product();
        /*product.name = "Laptop";
        product.id = 1;
        product.description = "Hp Laptop";
        product.price = 10000;
        product.stockAmount = 3;
        */

        //productManager.Add(product);

        //System.out.println(product.name);

        product.setId(1);
        product.set_name("Laptop");
        product.set_description("HP Laptop");
        product.set_stockAmount(3);
        product.set_price(10000);
        System.out.println(product.getKod());



    }
}