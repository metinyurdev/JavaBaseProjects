//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        //abstract class lardan nesne olusturulamaz
        //GameCalculator gameCalculator = new GameCalculator();


        GameCalculator gameCalculator = new WomanGameCalculator();

    }
}