import java.util.Scanner;

public class Factorial {

	public int factorial(int n ) {
		
		if(n >= 1)
			return n*factorial(n-1);
		else
			return 1;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Factorial factorial = new Factorial();
		
		System.out.println("Enter factorial: ");
		int i = input.nextInt();
		
		System.out.println(factorial.factorial(i));
		input.close();

	}

}
