package package1;

import java.util.*;

public class L2Q4 {

	public static void main(String[] args) {
		String student_id, firstName,lastName,target_grade;
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("Enter your student ID: ");
		student_id = scanf.next();
		
		System.out.print("Enter your first name: ");
		firstName = scanf.next();
		
		System.out.print("Enter your last name: ");
		lastName = scanf.next();
		
		System.out.print("Enter your target grade for CISB254: ");
		target_grade = scanf.next();
		
		System.out.println("You have entered followings");
		System.out.println("ID: " + student_id);
		System.out.println("First name: " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Targetted grade: " + target_grade);
		
		scanf.close();
	}
}
