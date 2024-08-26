import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        BufferedReader reader = null;
        int total = 0;
        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\metin\\Desktop\\Java Projects\\kodlarım\\BTK_AKADEMİ\\readingFileDemo\\src\\sayilar.txt"));
            String line  = null;
            while((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam= " + total);
        } catch(FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }catch (Exception exception){

            }
        }
    }
}