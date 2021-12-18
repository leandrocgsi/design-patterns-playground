package br.com.erudio.banks;

//ICICI
public class Itau implements Bank {
	
	private final String bankName;

	public Itau() {
		bankName = "ITAU BANK";
	}

	public String getBankName() {
		return bankName;
	}
}