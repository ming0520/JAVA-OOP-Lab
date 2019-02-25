package Q3;

public class Cheque extends Bank{
	
	private int check;
	private String ID;
	private String date;
	private float chequeAmount;
	
	public Cheque() {
		
	}
	
	public Cheque(int check, String ID, String date, float chequeAmount) {
		this.check = check;
		this.ID = ID;
		this.date = date;
		this.chequeAmount = chequeAmount;
	}
	
	public void setCheque(int check, String ID, String date, float chequeAmount) {
		this.check = check;
		this.ID = ID;
		this.date = date;
		this.chequeAmount = chequeAmount;
	}
	
	public int getCheck () {
		return this.check;
	}
	
	public String getID () {
		return this.ID;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public float getChequeAmount() {
		return this.chequeAmount;
	}
	
	public boolean checkCheque() {
		boolean isEnough = false;
		
		if(this.chequeAmount <= this.getAmount()) {
			isEnough = true;
		}
		
		return isEnough;
	}
	

}
