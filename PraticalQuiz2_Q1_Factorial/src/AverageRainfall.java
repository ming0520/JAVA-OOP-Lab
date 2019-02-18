import java.util.Scanner;

public class AverageRainfall {

	public static void calculate(int[] n, int day) {
		int total = 0;
		
		for(int j=0; j<day; j++) {
			total += n[j];
		}
		
		int average = total / day;
		
		System.out.println("The sum is " + total + " and the average is " + average + ".");
		
	}
	
	public static void calculate(float[] n, int day) {
		float total = 0;
		
		for(int j=0; j<day; j++) {
			total += n[j];
		}
		
		float average = total / day;
		
		System.out.printf("The sum is %.2f degree Celcius and the average is %.2f degree Celsius.", total, average);
		
	}
	
	public static void calculate(double[] n, int day) {
		double total = 0;
		
		for(int j=0; j<day; j++) {
			total += n[j];
		}
		
		double average = total / day;
		
		System.out.printf("The sum is %.2fmm and the average is %.2fmm.", total, average);
		
	}
	
	public static void main(String[] args) {
		int[] marks = new int[10];
		float[] temperature = new float[10];
		double[] rainfall = new double[10];
		int num = 1, i = 0, choice = 0;		

		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter 1 for student marks.\nEnter 2 for temperature (degree Celsius).\nEnter 3 for rainfall data (in mm).\n");
			choice = input.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the");
				for( ; i<10; i++) {
					System.out.print("Mark student" + num + ": ");
					marks[i] = input.nextInt();
					num++;
				}
				calculate(marks, i);		
			}
			else if(choice == 2) {
				System.out.println("Enter the");
				for(i=0; i<10; i++) {
					System.out.print("Temperature day" + num + ": ");
					temperature[i] = input.nextFloat();
					num++;
				}
				calculate(temperature, i);
			}
			else if(choice == 3) {
				System.out.println("Enter the");
				for(i=0; i<10; i++) {
					System.out.print("Raifall day" + num + ": ");
					rainfall[i] = input.nextDouble();
					num++;
				}
				calculate(rainfall, i);
				
			}
			else {
				System.out.println("Invalid value, please enter again!");
			}
		}while(choice < 0 || choice > 3);
		
		input.close();
	}


}
