package Q3;

import java.util.*;
import java.text.*;

public class CFG {

	public static void main(String[] args) {
		Bank HLB[]  = new Bank[2];
		Date today = new Date();
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("dd/MM/YYYY");
		DecimalFormat DF1 = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Before transaction");
		
		HLB[0] = new Bank("HLB-001",(float)200.255);
		HLB[1] = new Bank("HLB-002",(float)330.783);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Bank account information");
			System.out.println("Bank Account : " + HLB[i].getBankAcc());
			System.out.println("Amount       : $" + DF1.format(HLB[i].getAmount()));
			System.out.println("===============================================\n\n");
		}
		
		System.out.println("Bank account: " + HLB[0].getBankAcc());
		System.out.println("Amount      : " + HLB[0].getAmount());
		
		System.out.print("Enter cheque amount: ");
		float chequeAmount = input.nextFloat();
		
		Cheque cheque1 = new Cheque(001, "frostyseb001",simpleDF1.format(today),chequeAmount);
		cheque1.setBank(HLB[0].getBankAcc(), HLB[0].getAmount());
		
		if(cheque1.checkCheque() == true) {
			HLB[0].credit(cheque1.getChequeAmount());
			HLB[1].deposit(cheque1.getChequeAmount());
			
			System.out.println("Transaction successfully!\n");
			System.out.println("Cheque information");
			System.out.println("Cheque ID    : " + cheque1.getCheck());
			System.out.println("ID           : " + cheque1.getID());
//			System.out.println("Bank account : " + cheque1.getBankAcc());
//			System.out.println("Amount       : " + cheque1.getAmount());
			System.out.println("Date         : " + cheque1.getDate());
			System.out.println("Transfer     : $" + DF1.format(cheque1.getChequeAmount()));
			System.out.println("===============================================\n");
			
			for(int i = 0; i < 2; i++) {
				System.out.println("Bank account information");
				System.out.println("Bank Account : " + HLB[i].getBankAcc());
				System.out.println("Amount       : $" + DF1.format(HLB[i].getAmount()));
				System.out.println("===============================================");
			}
		}
		else {
			System.out.println("There is no enough money!");
			System.out.println("Cheque canceled!");
		}
	}

}
