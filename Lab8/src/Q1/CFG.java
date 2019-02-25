package Q1;

public class CFG {

	public static void main(String[] args) {
		Employee jason = new Employee();
		Employee sebastian = new Employee();
		jason.set(25, 5, 20000);
		sebastian.set(20, 6, 35210);
		System.out.println("Jason");
		jason.get();
		System.out.println("====================================");
		System.out.println("Sebastian");
		sebastian.get();

	}

}
