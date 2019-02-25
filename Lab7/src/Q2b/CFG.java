package Q2b;

import Q2b.AddTwoInt;

public class CFG {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, sum = 0;
		AddTwoInt addtwoint = new AddTwoInt(num1,num2);
		sum = addtwoint.getSum();
		System.out.println("Sum of " + num1 +" and " + num2 + " is " + sum);
		
		String str1 ="Java";
		String str2 = " is my favorite programming languages\n";
		String cStr = Language.add(str1, str2);
		System.out.println(cStr);
		Differences diffr1 = new Differences("Programming is awesome.\n");
		diffr1.get();
		Differences diffr2 = new Differences("Java is awesome.\n");
		diffr2.get();
	}

}
