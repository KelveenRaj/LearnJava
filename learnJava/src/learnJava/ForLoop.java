package learnJava;
import java.util.*;

public class ForLoop {

	public static void main(String[] args) {
		
		System.out.println("Input N");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		//Look for 10 times (1-10)
		for (int i=1; i<=10; i++) {
			System.out.println(N*i);
		}
	}
}
