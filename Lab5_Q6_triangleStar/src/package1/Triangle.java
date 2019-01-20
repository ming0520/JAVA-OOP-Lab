package package1;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		int i = 10;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of rows: ");
		
		while(true) {
			if(input.hasNextInt()) {
				i = input.nextInt();
				break;
			}
			else {
				System.out.println("Invalid input!");
				continue;
			}
		}
		
		for(int row = 0; row < i; row++) {
			int space = row;
			for(; space < i - 1; space ++) {
				System.out.print(" ");
			}
			
			for(int star = 0; star < row + 1; star++) {
				System.out.print("*");
			}
			
			for(int star = 0; star < row ; star++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		input.close();

	}

}
