package pack1;

import java.util.*;

public class selectFile {

	public static void main(String[] args) {
		char drive;
		String path;
		String fileName;
		String fileType;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Select drive: ");
		drive = (char)input.nextLine().charAt(0);
		
		System.out.print("Select path: ");
		path = input.nextLine();
		
		System.out.print("Select file: ");
		fileName = input.nextLine();
		
		System.out.print("Select Type: ");
		fileType = input.nextLine();
		
		input.close();
		
		System.out.println(drive + ":" + path + "\\" + fileName +"." + fileType);

	}

}
