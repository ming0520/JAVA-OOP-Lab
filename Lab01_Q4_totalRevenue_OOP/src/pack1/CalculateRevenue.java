package pack1;

public class CalculateRevenue {

	public static void main(String[] args) {
		Concert BigBang = new Concert();
		BigBang.setNumberOfCategories(3);
		String[] noc = {"Orchestra      ","Main Floor     ","Balcony        "};
		BigBang.setNameOfCategories(noc);
		int[] pot = {25,30,15};
		BigBang.setPriceOfTickets(pot);
		int[] ts = {2,1,2};
		BigBang.setTicketsSold(ts);
		BigBang.displayData();
	}

}
