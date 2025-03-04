package pack1;

import java.util.*;

public class reverseNumber {
	
	/**
	 * 
	 * Author: Zhong Ming Tan
	 * Date	 : 2018-January-08
	 * Function: Reverse the number
	 * 
	 */

	/*public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();
		reverseNumberInt(number);
		input.close();
	}
	
	private static void reverseNumberInt(int number) {
		System.out.print(number%10);
		number /= 10;
		if(number > 0)
			reverseNumberInt(number);
	}*/
	
	/* Alternative version */
	
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.println(number%10);
			reverseMethod(number/10);
		}
	}
	
	public static void main (String args[]) {
		int num = 0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println("Reverse of the input number is: ");
		reverseMethod(num);
		System.out.println();
		in.close();
	}

}