import java.util.*;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int rowIn = 0, tenth  = 10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of row: ");
		
		while(true) {
			if(input.hasNextInt()) {
				rowIn = input.nextInt();
				if(rowIn > 0) {
					break;
				}
			}
				System.out.println("Invalid choice, please try again: ");
				input.nextLine();
				continue;
		}
		for(int row = 1; row <= rowIn; row++) {
			for(int col = 1; col <= row; col++) {
				int num = col;
				
				if(num >= tenth) {
					num++;
				}
				
				num %= tenth;
				
				System.out.print((num));
			}
			System.out.println("");
		}
		
	}

}
