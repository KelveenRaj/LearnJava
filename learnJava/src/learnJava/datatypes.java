package learnJava;
import java.util.*;

public class datatypes {

	public static void main(String[] args) {
		
		int i = 4;
		double d = 4.0;
		String s = "Hello ";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input int");
		int i2 = scan.nextInt();
		System.out.println("Input double");
		double d2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Input String");
		String s2 = scan.nextLine();
		
		System.out.println( i + i2);
		System.out.println( d + d2);
		System.out.println( s + s2);
		
		
		
		

	}

}
