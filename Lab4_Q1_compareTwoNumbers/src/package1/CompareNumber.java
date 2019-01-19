package package1;

import java.util.*;

public class CompareNumber {

	public static void main(String[] args) {
			float number1,number2;
			float big = 0,small = 0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter two numbers");
			number1 = scanner.nextFloat();
			number2 = scanner.nextFloat();
			
			if(!(number1 == number2)) {
				
				if(number1 > number2) {
					big = number1;
					small = number2;
				}
				else if(number1 < number2) {
					big = number2;
					small = number1;
				}
				System.out.println(big + " is greater than " + small);
			}
			else {
				System.out.println("They are equal");
			}
			scanner.close();
	}
}