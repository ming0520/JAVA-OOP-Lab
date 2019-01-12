package package1;

import java.util.*;
import java.text.*;

public class Ch3LoanCalculator {

	public static void main(String[] args) {
		
		double loanAmount,annualInterestRate;
		double monthlyInterestRate;
		double monthlyPayment, totalPayment;
		
		int loanPeriod;
		int numberOfPayments;
		
		monthlyPayment = 132.15;
		totalPayment = 15858.10;
		final int MONTHS_IN_YEAR = 12;
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		Scanner scanner = new Scanner (System.in);
		
		//Get user input
		System.out.print("Loan Amount ( Dollars + Cents ): ");
		loanAmount = scanner.nextDouble();
		
		System.out.print("Annual Interest Rate (e.g.,9.5): ");
		annualInterestRate = scanner.nextDouble();

		System.out.print("Loan Period - # of years: ");
		loanPeriod = scanner.nextInt();
		
		//Operation start
		monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / 100;
		numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
		monthlyPayment = (loanAmount * monthlyInterestRate) / ( 1 - Math.pow( 1 / ( 1 + monthlyInterestRate ) , numberOfPayments));
		totalPayment = monthlyPayment * numberOfPayments;
		
		//Display information
		System.out.println("");
		System.out.println("Loan Amount          : $" + loanAmount);
		System.out.println("Annual Interest Rate : " + annualInterestRate +"%");
		System.out.println("Loan Period (years)  : " + loanPeriod);
		
		System.out.println("Monthly payment   is $" + df.format(monthlyPayment));
		System.out.println("    TOTAL payment is $" + df.format(totalPayment));
		
		scanner.close();
		
		
	}

}
