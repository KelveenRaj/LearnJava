package learnJava;
import java.util.*;

//Std in & Std out

public class StdinStdout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a");
		int a = scan.nextInt();
		System.out.println("Input b");
		int b = scan.nextInt();
		System.out.println("Input c");
		int c = scan.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
				
	}
}
