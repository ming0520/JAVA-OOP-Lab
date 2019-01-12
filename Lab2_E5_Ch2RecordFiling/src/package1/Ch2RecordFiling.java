package package1;

import java.util.*;

public class Ch2RecordFiling {

	public static void main(String[] args) {
		String firstName, lastName;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your fullname: ");
		firstName = scanner.next();
		lastName = scanner.next();
		
		System.out.println("Your medical record is filed under " +
		lastName + ", " + firstName + ".");
		scanner.close();
	}

}