import java.sql.SQLOutput;

public class ProductValidator {

    public ProductValidator(){
        System.out.println("Cosntructor calisti");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty())
            return true;
        else {
            return false;
        }
    }
    public void bisey(){}

    //Inner Class
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }



}
