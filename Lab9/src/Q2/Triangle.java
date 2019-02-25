package Q2;

public class Triangle {

	private int base;
	private int height;
	
	public Triangle() {
		this.base = 5;
		this.height = 10;
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public void set (int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public void destruct() throws Throwable {
		try {
			this.base = 0;
			this.height = 0;
		}finally {
			super.finalize();
		}
		System.out.println("Desctructed!");
	}
}
