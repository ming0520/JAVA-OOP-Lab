package pakage1;

import java.util.*;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0, b = 0, c = 0, area;
		
			do {
				System.out.println("Enter three sides of a Triagle");
				System.out.print("Given a,b,c: ");
				
				if(input.hasNextDouble()) {
					
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
					
					area = heron(a,b,c);
					System.out.println("Area of triangle: " + String.format("%.2f", area));
					
				}
				else {
					
					System.out.println("No input, program terminated");
					break;
					
				}
				
			}while(true);
		
		input.close();

	}
	
	public static double heron (double a, double b, double c) {
		double S = (a+b+c) / 2;
		double area = Math.sqrt((S * ( S - a ) * ( S - b ) * ( S - c )));
		return area;
	}

}
