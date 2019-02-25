package Q3;

public class CFG {

	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println("Inside the method m1 by object of GFG class");
		System.out.println("In method m2 came from method m1");
		System.out.println("Control returned after method m1: " + obj.m1());
		System.out.println("No of instances created till now: " + Test.get());

	}

}
