package package1;

import java.util.*;

public class OctalToDecimal {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal = 0, quotient = 0, octal = 0;
		
		System.out.println("Convert decimal to octal");
		do {
			decimal = 0; quotient = 0; octal = 0;
			System.out.print("Enter decimal: ");
			
			if(input.hasNextInt()) {
				decimal = input.nextInt();
			}
			else {
				System.out.println("No input, program terminated");
				break;
			}
			
			quotient = decimal;
			
			for(int i = 1; quotient!= 0; i*=10) {
				octal += (quotient % 8) * i;
				quotient /= 8;
			}
			
				System.out.println(octal);
		}while(true);
	}

}
