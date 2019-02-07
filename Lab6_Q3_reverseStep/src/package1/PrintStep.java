package package1;

public class PrintStep {

	public static void main(String[] args) {
		int level = 7;
		
		for(int row = 0; row < level; row ++ ) {
			for(int star = 0; star < level - row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
