import java.util.*;
public class NumberOfDayInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		int year = 2019;
		int month = Calendar.FEBRUARY;
		int date = 1;
		calendar.set(year, month,date);
		
		System.out.println("Enter year: ");
		
		while(true) {
			if(input.hasNextInt()) {
				year = input.nextInt();
				break;
			}
			else {
				System.out.print("Invalid choice, please try again: ");
				input.nextLine();
				continue;
			}
		}
		
		System.out.println("Enter month: ");
		
		while(true) {
			if(input.hasNextInt()) {
				month = input.nextInt();
				break;
			}
			else {
				System.out.print("Invalid choice, please try again: ");
				input.nextLine();
				continue;
			}
		}
		
		calendar.set(year, month-1, date);
		
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("Number of day in month " + month +" is " + maxDay);
		calendar.clear();
		input.close();	
		
	}

}
