package br.com.erudio.banks;

//SBI 
public class Santander implements Bank {
	
	private final String bankName;

	public Santander() {
		bankName = "SANTANDER BANK";
	}

	public String getBankName() {
		return bankName;
	}
}