import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book", "kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        System.out.println("------------");

        for(String item: sozluk.keySet() ){
            System.out.println(item);
        }

        System.out.println("-----------------");

        for(String value: sozluk.values()){
            System.out.println(value);
        }

        System.out.println("------------------");

        for(String item: sozluk.keySet()){
            System.out.println("Eleman: " + item + " Deger: " + sozluk.get(item));
        }

        System.out.println("--------------------");

        System.out.println(sozluk);
        sozluk.remove("table");
        //sozluk.clear();
        System.out.println(sozluk.get("table"));

    }
}