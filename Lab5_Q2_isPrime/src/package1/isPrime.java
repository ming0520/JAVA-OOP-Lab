package package1;

import java.util.*;

public class isPrime {

	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;
		
		Scanner input = new Scanner(System.in);
		
		do {
			isPrime = true;
			System.out.print("Enter number to check prime number: ");
			number = input.nextInt();
			if(number < 0) {
				System.out.println("Prime must be an integer");
				continue;
			}
			
			for (int i = 2; i <= number / 2 ; i++) {
				if(number % i == 0){
					isPrime = false;
					break;
				}
			}
			//System.out.println(isPrime);
			
			if(isPrime) {
				System.out.println("Is prime");
			}
			else if (!isPrime) {
				System.out.println("Not prime");
			}
		}while(true);

	}

}
