package package1;

import java.util.*;

public class MULT {

	public static void main(String[] args) {
		int x = 0, y = 0;
		Scanner input = new Scanner(System.in);		
		
		do {
			if(x != 0 && y != 0) {
				System.out.println("The multiplication result is " + x*y);
			}
			System.out.println("Enter two integer values:");
			if(input.hasNextInt()) {
				x = input.nextInt();
				y = input.nextInt();
			}
			
			
		}while(x >= 0 || y >= 0);
		
		System.out.println("End of run");
		input.close();
		System.exit(0);

	}
	
	
}
