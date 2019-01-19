package package1;

import java.util.*;

public class Ch2Greetings {

	public static void main(String[] args) {
		String firstName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? "); 
		
		firstName = scanner.next();//accept characters up to, but not space
		
		System.out.println( "Hi, " + firstName + ". Nice to meet you.");
		scanner.close();

	}

}
