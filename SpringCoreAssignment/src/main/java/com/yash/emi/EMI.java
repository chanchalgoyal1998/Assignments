package com.yash.emi;

import java.util.Scanner;

public class EMI {

	double loanAmount;
	double months;
	double irate; 
	
	public double emiCalculate(double interestRate) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount for loan");
		loanAmount=sc.nextDouble();
		System.out.println("Enter  months");
		months=sc.nextDouble();
		
		irate=irate/(12*100);
		return (loanAmount * irate * Math.pow(1 + irate, months))
				/ (Math.pow(1 + irate, months) - 1);

	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getMonths() {
		return months;
	}

	public void setMonths(double months) {
		this.months = months;
	}

	public double getIrate() {
		return irate;
	}

	public void setIrate(double irate) {
		this.irate = irate;
	}

}
