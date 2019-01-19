package pack1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create new object for grade and input
		 */
		Grade grade = new Grade();
		Scanner input = new Scanner(System.in);
		
		/*
		 * Ask user letter grade
		 */
		System.out.print("Letter grade: ");
		grade.setGrade(input.next());//set the grade by its methods
		
		//display the proper grade points
		System.out.println("Grade points: " + grade.getGradePoints());
		
		input.close();
	}

}
