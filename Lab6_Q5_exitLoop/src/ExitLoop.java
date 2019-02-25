
import java.util.*;

public class ExitLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char choice = 'e';
		boolean isContinue = true;
		
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a. int\r\n" + 
				"b. continue\r\n" + 
				"c. break\r\n" + 
				"d. exit\r\n" + 
				"");
	
			while(isContinue) {
				System.out.print("Enter your choice:");
				choice  = (char)(input.nextLine().toUpperCase().charAt(0));
					
				switch(choice) {
					case 'C':
						System.out.println("Correct answer!");
						isContinue = false;
						break;
					default:
						System.out.println("Incorrect!\r\n" + 
								"Again? press y to continue.\r");
						
						choice  = (char)(input.nextLine().toUpperCase().charAt(0));
						
						if(choice == 'Y') {
							isContinue = true;
						}
						else {
							isContinue = false;
						}
						break;
				}
			}
	}

}
