package learnJava;
import java.util.*;

public class DoWhileLoopExample1 {

	public static void main(String[] args) {
		
		//User input string value
		System.out.println("Input sentence");
		Scanner input = new Scanner(System.in);
		//input value will be put into sentence
		String sentence = input.nextLine();
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		
		System.out.println(words);
	}
}
