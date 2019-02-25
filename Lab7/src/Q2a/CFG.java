package Q2a;

import Q2b.AddTwoInt;

public class CFG {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, sum = 0;
		AddTwoInt addtwoint = new AddTwoInt(num1,num2);
		sum = addtwoint.getSum();
		System.out.println("Sum of " + num1 +" and " + num2 + " is " + sum);
		
		String str1 ="Java";
		String str2 = " is my favorite programming languages";
		String cStr = Language.add(str1, str2);
		System.out.println(cStr);
	}

}
