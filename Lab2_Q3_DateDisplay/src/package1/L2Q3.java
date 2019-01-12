package package1;

import java.util.*;
import java.text.*;

public class L2Q3 {
	public static void main(String[] args) {
		Date today;
		today = new Date();
		
		SimpleDateFormat simpleDF1,simpleDF2;
		simpleDF1 = new SimpleDateFormat();
		simpleDF2 = new SimpleDateFormat("E, MMM dd, ''yy");
		
		System.out.println("Today is " + 
		simpleDF1.format(today));
		
		System.out.println("Today is " +
		simpleDF2.format(today));
	}
}
