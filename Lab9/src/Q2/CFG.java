package Q2;

import java.util.Scanner;

public class CFG {
	
	public static void main (String[] args){
		Triangle triangle1 = new Triangle();
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Default height : %d base : %d \n",
				triangle1.getHeight(), triangle1.getBase());
		int base = 0, height = 0;
		
		do {
			System.out.println("Enter base and height: ");
			base = input.nextInt();
			height = input.nextInt();
			triangle1.set(base, height);
			System.out.printf("New height : %d base : %d \n",
					triangle1.getHeight(), triangle1.getBase());
			
		}while((base > 0) && (height > 0));
		
		try {
			triangle1.destruct();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Program end!");
	}

}
