package Q2;

import java.util.*;
import java.text.*;

public class CFG {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("dd/MM/YY");
		Date today = new Date();
		
		String car_num = "MBC 1123";
		String date = simpleDF1.format(today);
		int sc = 321442;
		int lh = 40;
		float cop = (float)3214.23;
		
		Service service1 = new Service(car_num,date,sc,lh,cop);
		
		System.out.println("Car number     : " + service1.get_car_number());
		System.out.println("Date           : " + service1.getDate());
		System.out.println("Service code   : " + service1.get_service_code());
		System.out.println("Labour hour    : " + service1.get_labour_hour());
		System.out.println("Labour cost    : " + service1.get_labour_cost());
		System.out.println("Costs of parts : " + service1.get_costs_of_parts());
		System.out.println("Total cost     : " + service1.get_total_costs());
		

	}

}
