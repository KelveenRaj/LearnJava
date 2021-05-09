package learnJava;
import java.util.*;

public class IfElse {
	
	private static final Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		int N = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();
        
        // If Odd number, between 6 and 20, print "Weird"
        if(N%2 == 1 || N>= 6 && N<= 20 ) {
        	System.out.println("Weird");
        }
        else if(N%2 == 0 || N>= 2 && N<= 5) {
        	System.out.println("Not Weird");
        }
  	}
}
