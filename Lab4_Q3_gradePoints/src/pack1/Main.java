package pack1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Grade grade = new Grade();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Letter grade: ");
		grade.setGrade(input.next());
		
		System.out.println("Grade points: " + grade.getGradePoints());
		
		input.close();
	}

}
