package introduction;
//@author Guilherme Martins
import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         System.out.println("1234567890123456789");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             System.out.printf("%-15s%03d\n",s1, x );
         }
         System.out.println("================================");
	}
}
