package package1;

import java.util.*;

public class calculateCharges {
	
	/*
	 * Constant for the charge
	 */
	public static final double PRICE_FIRST_POUND = (double)10;
	public static final double PRICE_EXCEED_POUND = (double)6;

	public static void main(String[] args) {
		//Initialize object and variable...
		Scanner input = new Scanner(System.in);
		double pound, charge = 0;
		
		//Get the weight
		System.out.print("WEIGHT (Pound): ");
		pound = input.nextDouble();
		
		if(pound >= 0) {
			//run only when pound is positive
			if(pound <= 1) {
				//run only when pound is smaller than 1
				charge = PRICE_FIRST_POUND;
			}
			else if (pound == 0) {
				//run only when pound is 0
				charge = 0;
			}
			else if(pound > 1){
				//run only pound is greater than 1
				
				//charge for the first pound
				charge += PRICE_FIRST_POUND;
				//minus first pound
				pound --;
				//charge for the ramining pound
				charge += (pound * PRICE_EXCEED_POUND);
			}
			//Display the charge
			System.out.printf("CHARGE: %.2f" , charge);
			
		}
		else {
			//run only pound is negative
			System.out.println("WEIGHT should be positive number");
		}
		input.close();
	}

}
