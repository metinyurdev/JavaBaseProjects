//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//built-in
import matematik.DortIslem;
import matematik.Logaritma;
//import matematik.*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(7,5);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}