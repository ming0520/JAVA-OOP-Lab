package pack1;

import java.util.*;

public class calculateSlices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pizza Hawaii = new Pizza();
		
		System.out.print("Diameter of pizza Hawaii\t: ");
		Hawaii.setDiameter(input.nextDouble());
		System.out.println("Suggested number of slices\t: "+ Hawaii.getSlices());
		
		input.close();
	}

}
