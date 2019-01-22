package package1;

import java.util.*;

public class Grade {
	
	static int a_s= 0;
	static int b_s = 0;
	static int c_s = 0;
	static int d_s = 0;
	static int f_s = 0;

	public static char checkGrade(int mark) {
		if(mark >= 90) {
			a_s++;
			return 'A';
		}
		else if(mark >= 80) {
			b_s++;
			return 'B';
		}
		else if(mark >= 70) {
			c_s++;
			return 'C';
		}
		else if(mark >= 60) {
			d_s++;
			return 'D';
		}
		else if(mark >= 0) {
			f_s++;
			return 'F';
		}
		else {
			return ' ';
		}
		
		
	}
	
	public static void dispCount () {
		System.out.print("A: " + a_s);
		System.out.print("\tB: " + b_s);
		System.out.print("\tC: " + c_s);
		System.out.print("\tD: " + c_s);
		System.out.print("\tF: " + f_s);
		System.out.println("\n===================================");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mark = 1;
		System.out.println("Enter to get the grade: ");
		
		while(mark > 0) {
			
			if(input.hasNextInt()) {
				mark = input.nextInt();  
				System.out.println(checkGrade(mark));
				dispCount();
				continue;
			}
			else {
				System.out.println("Invalid input!");
			}
			
			if(mark < 0) {
				input.close();
				System.out.println("Invalid input!");
				System.exit(0);
			}
			
		}
	}
}
