//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava cok guzel.";
        String yenimesaj = mesaj.substring(0,2);
        System.out.println(yenimesaj);
        String newmessage = sehirVer();
        int sayi = topla(15,7);
        System.out.println(sayi);

        //Variable Arguments 
        int toplam = topla2(2,3,4,10,25,72);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil(){
        System.out.println("Silindi");

    }

    public static void guncelle(){
        System.out.println("Guncellendi");

    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    //Using Variable Arguments
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar) {
            toplam += sayi;

        }

        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}