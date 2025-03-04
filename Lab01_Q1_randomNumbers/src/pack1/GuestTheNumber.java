package pack1;

import java.util.*;

public class GuestTheNumber {

	public static void main(String[] args) {
		/*
		 * Initialize variable and object
		 */
		
		// Create an object for generate number automatically
		Random rand = new Random();
		// Create an object to ask user input
		Scanner input = new Scanner(System.in);
		// An variable to control the loop, when continue is true the loop will continue
		boolean isContinue = true;
		//An variable to store the binary choice for user.
		char isYes;
		
		/*
		 *  Start the game
		 */
		while(isContinue) {
			/*
			 * Initialize variable
			 */
			//An array that store two auto generated number
			int[] randNumber = new int [2];
			// result is a variable that store the sum of array for randNumber
			// userGuess is a variable that store the answer from user
			int result = 0, userGuess = 0;
			
			System.out.println("Addition of");
			
			/*
			 * A loop that auto generated the value from 0 to 9
			 * and Sum the number generated of the array
			 * then store in variable result
			 */
			for(int i = 0; i < 2; i++) {
				randNumber[i] = (int)rand.nextInt(10);
				System.out.println("Number " + (i+1) + " is " + randNumber[i]);
				result += randNumber[i];
				//System.out.println("Answer is " + result);
			}
			
			// Get the guess number from user
			System.out.print("Give the answer then press <enter>:");
			userGuess = input.nextInt();
			
			/*
			 * Checking for the answer
			 */
			if(result != userGuess) { //run when answer is wrong (the sum of the array != the answer user given)
				System.out.println("Wrong answer, Keep it up!");
			}
			else { // run when the answer is correct (the sum of the array = the answer user given)
				System.out.println("Correct answer, Congratulations!");
			}
			
			//flush the output stream
			System.out.flush();
			
			
			/*
			 * Ask user to continue or end the program
			 */
			System.out.print("Continue? (Y/N): ");
			// Get the input as string and store the first character at variable isYes
			isYes = (char)input.next().charAt(0);
			isYes = Character.toUpperCase(isYes);
			
			//Decision point to continue to program
			switch(isYes){
				case 'Y':
					isContinue = true;
					break;
				case 'N':
					isContinue = false;
					break;
				default:
					System.out.println("Invalid choice!");
					continue;
			}
			
			//A separated line*********************************************
			System.out.println("=================================\n");
			
		}
		input.close();
	}

}
