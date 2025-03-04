package pack1;

public class Grade {
	/*
	 * Property for grade
	 * Array for GRADE {A,B,C,D,F} = {4,3,2,1,0}
	 */
	public static final int[] GRADE = {4,3,2,1,0};
	int gradePoints = 0;
	char c = 'F'; //character holder that store Letter Grade
	
	/*
	 * Function that set the letter grade in string
	 * Covert string to character and store in variable c
	 */
	public void setGrade(String grade) {
		this.c = grade.charAt(0);// get the first character of the string
		this.c = Character.toUpperCase(this.c); // convert into uppercase
	}
	
	public int getGradePoints() {

		//Determine the letter grade and assign gradePoints that store in the array
		switch (this.c) {
			case 'A':
				this.gradePoints = GRADE[0];
				break;
			case 'B':
				this.gradePoints = GRADE[1];
				break;
			case 'C':
				this.gradePoints = GRADE[2];
				break;
			case 'D':
				this.gradePoints = GRADE[3];
				break;
			case 'F':
				this.gradePoints = GRADE[4];
				break;
			default://Run when invalid letter grade
				System.out.println("Invalid Grade");
				return 0;// return nothing
		}
		//return gradePoints
		return this.gradePoints;
	}

}
