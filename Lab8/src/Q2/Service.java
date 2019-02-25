package Q2;

public class Service {
	private String car_number;
	private String date;
	private int service_code;
	private int labour_hour;
	private float labour_cost;
	private float costs_of_part;
	private float total_cost;
	
	public Service() {
		
	}
	public Service (String carNum, String date, int sc, int lh, float cop) {
		this.car_number = carNum;
		this.date = date;
		this.service_code = sc;
		this.labour_hour = lh;
		this.costs_of_part = cop;
		this.calculate_labour_cost();
		this.calculate_total_cost();
	}
	
	public void calculate_total_cost() {
		this.total_cost = this.costs_of_part + this.labour_cost;
	}
	
	public void calculate_labour_cost() {
		this.labour_cost = this.labour_hour * (float)52;
	}
	
	public String get_car_number() {
		return this.car_number;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public int get_service_code() {
		return this.service_code;
	}
	
	public int get_labour_hour() {
		return this.labour_hour;
	}
	
	public float get_labour_cost () {
		return this.labour_cost;
	}
	
	public float get_costs_of_parts() {
		return this.costs_of_part;
	}
	
	public float get_total_costs() {
		return this.total_cost;
	}

}
