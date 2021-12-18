package br.com.erudio.loan;

public class BussinessLoan extends Loan {
	
	@Override
	public void getInterestRate(double r) {
		rate = r;
	}
}
