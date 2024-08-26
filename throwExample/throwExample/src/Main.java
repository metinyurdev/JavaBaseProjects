//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            IstisnaYakala.konumHesapla(0);
        } catch (ArithmeticException exception){
            System.out.println("Konum bilginiz yanlıs");
        }
        finally {
            System.out.println("Finally calisti");
        }


    }
}