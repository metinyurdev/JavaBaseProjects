//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Metin";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Nuh";

        for(int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------");

        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }


    }
}