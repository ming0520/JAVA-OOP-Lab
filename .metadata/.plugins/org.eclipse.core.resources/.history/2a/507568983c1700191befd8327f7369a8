package pack1;

public class Grade {
	
	public static final int[] GRADE = {4,3,2,1,0};
	int gradePoints = 0;
	char c = 'F';
	
	public void setGrade(String grade) {
		this.c = grade.charAt(0);
		this.c = Character.toUpperCase(this.c);
	}
	
	public int getGradePoints() {

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
			default:
				System.out.println("Invalid Grade");
				return 0;
		}
		return this.gradePoints;
	}

}
