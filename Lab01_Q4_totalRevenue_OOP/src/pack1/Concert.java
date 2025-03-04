package pack1;

public class Concert {
	
	private int		   NUMBER_OF_CATEGORIES;
	private int		[] PRICE_OF_TICKETS      = new 	int		[NUMBER_OF_CATEGORIES];
	private String	[] NAME_OF_CATEGORIES    = new 	String	[NUMBER_OF_CATEGORIES];
	private int		[] tickets_sold 		 = new 	int		[NUMBER_OF_CATEGORIES];
	private int		   total_revenue;
	
	public void setNumberOfCategories(int noc) {
		this.NUMBER_OF_CATEGORIES = noc;
	}
	
	public void setNameOfCategories (String[] name) {
		this.NAME_OF_CATEGORIES = name;
	}
	
	public void setPriceOfTickets (int[] pot) {
		this.PRICE_OF_TICKETS = pot;
	}
	
	public void setTicketsSold (int[] ts) {
		this.tickets_sold =  ts;
	}
	
	public void displayData() {
		/*
		 * A loop that sum all of the revenue that generated by the concert for each categories
		 */
		for(int i = 0; i < this.NUMBER_OF_CATEGORIES; i++) {
			this.total_revenue += (this.tickets_sold[i] * this.PRICE_OF_TICKETS [i]); 
		}
		/*
		 * Display the spreadsheet for the total revenue
		 */
		System.out.println("========================Total Revenue======================");
		System.out.println("Categories     Price     Tickets Sold     Total");
		System.out.println("----------     -----     ------------     -----");
		for(int i = 0; i < this.NUMBER_OF_CATEGORIES; i++) {			
			System.out.print(this.NAME_OF_CATEGORIES[i]);
			System.out.print("$" + this.PRICE_OF_TICKETS[i]);
			System.out.print("\t     ");
			System.out.print(tickets_sold[i] + "\t\t  ");
			System.out.println("$" + this.PRICE_OF_TICKETS[i] * this.tickets_sold[i]);
		}
		
		System.out.println("Total revenue  -------------------------> $" + this.total_revenue);
	}
}
