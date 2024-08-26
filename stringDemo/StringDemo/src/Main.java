//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel";
        //char[]
        System.out.println(mesaj);

//        System.out.println("Eleman sayisi: " + mesaj.length());
//        System.out.println("5. eleman: " + mesaj.charAt(4));
//        System.out.println(mesaj.concat(" Yasasin!"));
//        System.out.println(mesaj);
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("l"));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0,5,karakterler,0);
//        for(char karakter:karakterler)
//        {
//            System.out.println(karakter);
//        }
//        System.out.println(karakterler);
//
//        System.out.println(mesaj.indexOf("a"));
//        System.out.println(mesaj.indexOf("ava"));
//        System.out.println(mesaj.lastIndexOf("a"));


        String yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        String newMessage = "    bugun    ";
        System.out.println(newMessage.trim());




    }
}