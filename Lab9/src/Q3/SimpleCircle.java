package Q3;

public class SimpleCircle {
	
	public final static double PI = Math.PI;
	private double radius;
	
	public SimpleCircle () {
		this.radius = (double) 9 ;
	}
	
	public SimpleCircle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setSelf(SimpleCircle simpleCircle) {
		this.radius = simpleCircle.radius;
	}
	
	public double getArea () {
		double area = this.PI * Math.pow(radius, 2);
		return area;
	}
}
