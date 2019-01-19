package pack1;

import java.util.*;

public class Marking {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Student Sebastian = new Student();
		
		int total = 0;
		float percentage;
		String[] Division = new String[3];
		Division[0] = "First";
		Division[1] = "Second";
		Division[2] = "Third";
		
		
		System.out.println("\nWelcome to marks sheet");
		System.out.println("Enter the name of student: ");
		Sebastian.name = input.nextLine();
		System.out.println("Enter the Roll Number: ");
		Sebastian.rollnum = input.next();
		System.out.println("Enter the College Name: ");
		Sebastian.colledge = input.next();
		System.out.println("Please enter mark for---------");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Subject " + i + " :");
			Sebastian.subject[i] = input.nextInt();
		}
		
		for(int j = 0; j < 5; j++) {
			total += Sebastian.subject[j];
		}
		
		percentage  = (float)total / 500 * 100;
		System.out.print("\n\n\t\t    Marksheet");
		System.out.print("\n============================================\n");
		System.out.println("\n\tName\t\t:\t " + Sebastian.name );
		
		for (int i = 0; i < Sebastian.subject.length; i++) {
			System.out.println("\tSubject" + i + "\t:\t " + Sebastian.subject[i]);
		}
		
		System.out.println("\tTotal\t\t:\t"+total);
		System.out.println("\tPercentage\t:\t"+percentage);
		
		int devisionInt = 0;
		
		if(percentage > 60) {
			devisionInt = 0;
		}
		else if (percentage > 40) {
			devisionInt = 1;
		}
		else {
			devisionInt = 2;
		}
		
		System.out.println("\tDivision\t:\t" + Division[devisionInt]);
		input.close();

	}

}
