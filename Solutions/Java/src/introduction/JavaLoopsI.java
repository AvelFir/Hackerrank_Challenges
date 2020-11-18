package introduction;

import java.util.Scanner;

//@author Guilherme Martins

public class JavaLoopsI {

    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i = 1; i <= 10; i++ ){
		    System.out.printf("%d x %d = %d\n", N, i, N*i);
		}
		
		scanner.close();
	}
}
