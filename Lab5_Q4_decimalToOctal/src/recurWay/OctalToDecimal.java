package recurWay;

import java.util.*;

public class OctalToDecimal {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal = 0;
		
		System.out.println("Convert decimal to octal");
		do {
			decimal = 0;
			System.out.print("Enter decimal: ");
			if(input.hasNextInt()) {
				decimal = input.nextInt();
			}
			else {
				System.out.println("No input, program terminated!");
				break;
			}
			recurOctal(decimal);
			System.out.println("");
		}while(true);
		input.close();
	}
	
	public static int recurOctal(int n) {
		if(n > 1)
			recurOctal(n/8);
		if(n>0)
			System.out.print(n%8);
		return n;	
	}

}
