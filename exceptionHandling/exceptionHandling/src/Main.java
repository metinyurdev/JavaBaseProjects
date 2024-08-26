//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try
        {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println("Loglandı: " + exception);
        }
        finally {
            System.out.println("Ben her turlu calisirim");
        }

    }
}