package package1;

public class Ch2StringProcessing {

	public static void main(String[] args) {
		String fullName, firstName, lastName, space;
		fullName = new String("Decafe Latte");
		space = new String (" ");
		
		firstName = fullName.substring(0,fullName.indexOf(space));
		lastName = fullName.substring(fullName.indexOf(space) + 1, fullName.length());
		
		System.out.println("Full Name:" + fullName);
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("Your last name has " + lastName.length() + " characters.");
	}

}
