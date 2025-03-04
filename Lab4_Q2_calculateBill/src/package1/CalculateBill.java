package package1;

import java.util.*;

public class CalculateBill {
	
	public static final double COUNTRY_TAX_A = (double)1.07;
	public static final double COUNTRY_TAX_OTHER = (double)1.05;
	

	public static void main(String[] args) {
		double purchase,taxRate = 0;
		char country;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Amount of purchase? ");
		purchase = input.nextDouble();
		
		System.out.print("Country? ");
		country = (char)input.next().charAt(0);
		country = Character.toUpperCase(country);
		
		switch(country) {
			case 'A':
				taxRate = COUNTRY_TAX_A;
				break;
			default:
				taxRate = COUNTRY_TAX_OTHER;
				break;
		}

		System.out.printf("Total Bill: $%,.2f%n", (purchase * taxRate));
		
		input.close();
	}

}
