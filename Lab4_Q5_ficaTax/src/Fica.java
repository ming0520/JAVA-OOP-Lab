import java.util.Scanner;

public class Fica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float current_earning = (float) 0.0, prev_earning = (float) 0.0;
		
		System.out.println("This week's pay?");
		current_earning = input.nextFloat();
		System.out.println("Previous pay?");
		prev_earning = input.nextFloat();
		
		System.out.println("FICA to withhold: $" + current_earning * 0.0765);

	}

}
