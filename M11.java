package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class M11 {

    public static void main(String[] args) {
        try (Scanner sc1 = new Scanner(new File("src/namess.txt"));
             FileWriter fw1 = new FileWriter("src/namess_out.txt"))
        {

            Tools1 t1 = new Tools1();
            while (sc1.hasNext()) {
                String name = sc1.nextLine();
                String name_rev = t1.reverse(name);
                fw1.write(name_rev + "\n");
                System.out.println(name_rev);
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}
