package Q3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CFG {

	public static void main(String[] args) {
		SimpleCircle defaultSimpleCircle = new SimpleCircle();
		Scanner input = new Scanner(System.in);
		DecimalFormat DF1 = new DecimalFormat("#.##");
		
		
		System.out.println("Default Simple Circle");
		System.out.println("Radius : " + DF1.format(defaultSimpleCircle.getRadius()));
		System.out.println("Area   : " + DF1.format(defaultSimpleCircle.getArea()));
		
		System.out.println("\n\nCreating new circle.....");
		System.out.println("Setting radius to 5....");
		SimpleCircle newCircle = new SimpleCircle(5);
		System.out.println("Created new circle !");
		System.out.println("Assign new circle to Default circle....\n\n");
		defaultSimpleCircle.setSelf(newCircle);
		
		System.out.println("New Default Simple Circle!");
		System.out.println("Radius : " + DF1.format(defaultSimpleCircle.getRadius()));
		System.out.println("Area   : " + DF1.format(defaultSimpleCircle.getArea()));
		
		System.out.println("\n\n");
		
		double radius;
		do {
			System.out.print("Enter radius : ");
			radius = input.nextDouble();
			newCircle.setRadius(radius);
			defaultSimpleCircle.setSelf(newCircle);
			System.out.println("Radius : " + DF1.format(defaultSimpleCircle.getRadius()));
			System.out.println("Area   : " + DF1.format(defaultSimpleCircle.getArea()));
		}while(radius > 0);
		
		

	}

}
