package learnJava;
import java.util.*;

//Odd Number/Even number

public class IfElseExample1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Number");
		int a = scan.nextInt();
		scan.close();
		
		if( a%2 == 1) {
			System.out.println("Odd Number");
		}
		else {
			System.out.println("Even Number");
		}
	}
}
