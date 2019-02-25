package Q3;

public class Bank{
	private String bankAcc;
	private float amount;
	
	public Bank() {
		
	}
	
	public Bank(String bankAcc, float amount) {
		this.bankAcc = bankAcc;
		this.amount = amount;
	}
	
	public void setBank(String bankAcc, float amount) {
		this.bankAcc = bankAcc;
		this.amount = amount;
	}
	
	public String getBankAcc() {
		return this.bankAcc;
	}
	
	public float getAmount () {
		return this.amount;
	}
	
	public void deposit (float deposit) {
		this.amount += deposit;
	}
	
	public void credit (float credit) {
		this.amount -= credit;
	}
}
