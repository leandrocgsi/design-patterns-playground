package br.com.erudio.factory;

import br.com.erudio.banks.Bank;
import br.com.erudio.loan.BussinessLoan;
import br.com.erudio.loan.EducationLoan;
import br.com.erudio.loan.HomeLoan;
import br.com.erudio.loan.Loan;

public class LoanFactory extends AbstractFactory {
	
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}