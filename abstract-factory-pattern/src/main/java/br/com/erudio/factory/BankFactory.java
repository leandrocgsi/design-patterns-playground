package br.com.erudio.factory;

import br.com.erudio.banks.Bank;
import br.com.erudio.banks.Bradesco;
import br.com.erudio.banks.Itau;
import br.com.erudio.banks.Santander;
import br.com.erudio.loan.Loan;

public class BankFactory extends AbstractFactory {

	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("BRADESCO")) {
			return new Bradesco();
		} else if (bank.equalsIgnoreCase("ITAU")) {
			return new Itau();
		} else if (bank.equalsIgnoreCase("SANTANDER")) {
			return new Santander();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}
