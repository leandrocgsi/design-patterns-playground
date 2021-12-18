package br.com.erudio.factory;

import br.com.erudio.banks.Bank;
import br.com.erudio.loan.Loan;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}