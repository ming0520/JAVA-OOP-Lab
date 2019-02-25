import java.util.*;
public class Order {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] numbers = new int[3];
		
		while(true) {
			System.out.println("Enter 3 number to determine the order: ");
			for(int i = 0; i < 3; i++) {
				numbers[i] = input.nextInt();
			}
			
			if( (numbers[0] > numbers[1]) && (numbers[1] > numbers[2]) ) {
				System.out.println("Decreasing order");
			}
			else if( (numbers[2] > numbers[1]) && (numbers[1] > numbers[0]) ) {
				System.out.println("Increasing order");
			}
			else {
				System.out.println("Neither increasing or decreasing order");
			}
			System.out.println("");
		}
	}

}
