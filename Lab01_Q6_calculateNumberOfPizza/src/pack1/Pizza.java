package pack1;

public class Pizza {
	private		  			double 			diameter;
	private		  			double		    area;
	private 	final 		double 			AREA_FOR_EACH_SLICES = 14.125;
	private 	final 		double			PI					 = 3.14;
	private 	  			int				numberOfPeople;
	private 	final 		int				numberOfSlicesForEachPerson = 4;
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
		calculateArea();
	}
	
	public void calculateArea(){
		this.area = this.PI * (Math.pow(this.diameter/2, 2));
	}
	
	public int getSlices() {
		return (int)(this.area/this.AREA_FOR_EACH_SLICES);
	}
	
	public void setNumberOfPeople(int nop) {
		this.numberOfPeople = nop;		
	}
	
	public int getNumberOfPizza() {
		int numberOfPizza = (this.numberOfPeople*this.numberOfSlicesForEachPerson)/this.getSlices();
		return numberOfPizza;
	}
}