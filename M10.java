package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M10 {

    public static void main(String[] args) {
        try {
            File f1 = new File("src/namess.txt");
            Scanner sc1 = new Scanner(f1);
            Tools1 t1 = new Tools1();
            while (sc1.hasNextLine()) {
                String name = sc1.nextLine();
                System.out.println(t1.reverse(name));
            }
            sc1.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file 'namess.txt' was not found.");
            e.printStackTrace();
        }
    }
}
