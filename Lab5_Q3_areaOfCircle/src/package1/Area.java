package package1;

import java.util.*;

public class Area {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius, area;
		
		System.out.println("Calculate the area of circle ");
		boolean isPositive = true;
		
		do {
			System.out.print("Enter radius: ");
			radius = input.nextDouble();
			if(radius < 0) {
				System.out.println("Radius must be positive");
				continue;
			}
			area = Math.pow(radius, 2) * Math.PI;
			System.out.println("Area: " + String.format("%.2f", area));
		}while(isPositive);
		input.close();
	}
}