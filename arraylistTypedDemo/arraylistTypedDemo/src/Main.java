import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Eskisehir");

        //sehirler.remove(0);
        sehirler.remove("Istanbul");

        Collections.sort(sehirler);
        for(String sehir: sehirler){
            System.out.println(sehir);
        }
    }
}