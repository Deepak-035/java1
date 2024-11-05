package pkg1;
import java.util.Scanner;
public class M2 {

	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String");
 		String s1=scanner.nextLine();
		int len1=s1.length();
		String s2=" ";
		for(int i=0;i<len1;i++){
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
				System.out.println(s2);

	}

}