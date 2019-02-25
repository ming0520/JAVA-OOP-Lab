import java.util.*;
public class CFG {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a = input.nextInt();
		System.out.println("Enter second integer: ");
		int b = input.nextInt();
		
		AddInt addInt = new AddInt(a,b);
		
		System.out.println("Sum: " + addInt.addTwoInt());

	}

}
