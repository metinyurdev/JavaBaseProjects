import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] sayilar = new int[]{1,2,3};
//        sayilar = new int[4];
//        System.out.println(sayilar[0]);
//        for(int sayi:sayilar)
//            System.out.println(sayi);

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(10);
        sayilar.add(1);
        sayilar.add("Ankara");
        sayilar.add(5.25);
        //System.out.println(sayilar);
        //System.out.println(sayilar.get(2));
        //sayilar.set(0,100);
        //System.out.println(sayilar.get(0));
        //sayilar.remove(0);
        //System.out.println(sayilar.get(0));
        //sayilar.clear();
        //System.out.println(sayilar.get(0));
        for(Object index:sayilar){
            System.out.println(index);
        }
    }
}