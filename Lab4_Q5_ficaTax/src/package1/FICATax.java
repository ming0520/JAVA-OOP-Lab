package package1;

public class FICATax {
	public static final float FICA_TAX = (float) 0.0765;
	float currentEarnings, prevEarnings;
	
	public void setCE (float ce) {
		this.currentEarnings = ce;
	}
	
	public void setPE (float pe) {
		this.prevEarnings = pe;
	}
}
