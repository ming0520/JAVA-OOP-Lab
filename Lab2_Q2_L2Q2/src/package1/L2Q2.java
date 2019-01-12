package package1;

public class L2Q2 {

	public static void main(String[] args) {
		String fullName, firstName, lastName,space;
		
		space = " ";
		fullName = "Decafe Latte";
		firstName = fullName.substring(0,fullName.indexOf(space));
		lastName = fullName.substring
				(fullName.indexOf(space) + 1 , fullName.length());
		
		System.out.println("Full Name: " + fullName);
		System.out.println("First: " + firstName);
		System.out.println("Last: " + lastName);
		System.out.println("Your first name has " 
		+ firstName.length() + " characters.");
		
	}

}
