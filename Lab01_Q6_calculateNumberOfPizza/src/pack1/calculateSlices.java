package pack1;

import java.util.*;

public class calculateSlices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pizza Hawaii = new Pizza();
		
		System.out.print("Enter number of people for the party\t: ");
		Hawaii.setNumberOfPeople(input.nextInt());
		
		System.out.print("Diameter of pizza Hawaii\t\t: ");
		Hawaii.setDiameter(input.nextDouble());
		System.out.println("Suggested number of slices\t\t: "+ Hawaii.getSlices());
		
		System.out.println("Pizza need to purchase\t\t\t: " + Hawaii.getNumberOfPizza());

		
		input.close();
	}

}
