package br.com.erudio.banks;

//HDFC
public class Bradesco implements Bank {
	
	private final String bankName;

	public Bradesco() {
		bankName = "BRADESCO BANK";
	}

	public String getBankName() {
		return bankName;
	}
}