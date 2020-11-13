package introduction;

//@author Guilherme Martins

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        if(N % 2 != 0 || (N > 6 && N < 20)) {
	        	System.out.println("Weird");
	        }
	        else if(N <= 5 || N >= 20) {
	        	System.out.println("Not Weird");
	        }
	        scanner.close();
	}
}
