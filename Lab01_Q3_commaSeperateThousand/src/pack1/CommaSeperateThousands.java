package pack1;

import java.util.*;

public class CommaSeperateThousands {

	public static void main(String[] args) {
		//initialize the variable
		long number = 0;
		// create an object (scanner) to get user input
		Scanner input = new Scanner(System.in);
		// Get the input from user
		System.out.print("Please enter an integer >= 1000: ");
		number = input.nextLong();
		
		
		if(number >= 1000) {
			//run when number greater then 1000
			seperate_thousands(number);
		}
		else {
			//run when number smaller than 1000
			System.out.println(number);
		}
		
		input.close();

	}
	
	/*
	 *  A recursion loop that add the comma separating the thousands
	 */
	public static void seperate_thousands(long number) {
		
		if(number >= 1000) {
			//recur the function if number greater than 1000
			seperate_thousands(number / 1000);
			//add the comma for every thousands
			System.out.print(",");
			// display the remainder of every thousands
			System.out.print(number % 1000);		
		}
		else {
			System.out.print(number);
		}		
	}

}
