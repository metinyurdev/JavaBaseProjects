import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file = new File("C:\\Users\\metin\\Desktop\\Java Projects\\kodlarım\\BTK_AKADEMİ\\files\\students.txt");
        try {
            if (file.createNewFile())
            {
                System.out.println("Dosya olusturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\metin\\Desktop\\Java Projects\\kodlarım\\BTK_AKADEMİ\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı " + file.getName());
            System.out.println("Dosya yolu " + file.getAbsoluteFile());
            System.out.println("Dosya okunabilir mi " + file.canRead());
            System.out.println("Dosya yazilabilir mi " + file.canWrite());
            System.out.println("Dosya boyutu(byte) " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\metin\\Desktop\\Java Projects\\kodlarım\\BTK_AKADEMİ\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\metin\\Desktop\\Java Projects\\kodlarım\\BTK_AKADEMİ\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}