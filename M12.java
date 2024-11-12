package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class M12 {
    public static void reverse2(String fname1, String fname2)
    {
        try (Scanner sc1 = new Scanner(new File(fname1));
             FileWriter fw1 = new FileWriter(fname2)) {

            Tools1 t1 = new Tools1();
            while (sc1.hasNext()) {
                String name = sc1.nextLine();
                String name_rev = t1.reverse(name);
                fw1.write(name_rev + "\n");
                System.out.println(name_rev);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while processing the files: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        reverse2("src/namess.txt", "src/namess_out.txt");
        reverse2("src/name1.txt", "src/name1_out.txt");
    }
}
