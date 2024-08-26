public class ProductManager {
    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Eklnedi");
        }
        else{
            System.out.println("Urun bilgileri gecersiz");
        }

    }
}
