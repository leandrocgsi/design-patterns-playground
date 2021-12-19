package br.com.erudio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the account holder name :");
			String customername = br.readLine();
			System.out.print("\n");

			System.out.print("Enter the account number:");
			long accountNumber = Long.parseLong(br.readLine());
			System.out.print("\n");

			System.out.print("Enter the bank name :");
			String bankname = br.readLine();

			setAccountHolderName(customername);
			setAccountNumber(accountNumber);
			setBankName(bankname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		long accountNumber = getAccountNumber();
		String accountHolderName = getAccountHolderName();
		String bankName = getBankName();

		return ("The Account number " + accountNumber + " of "
				+ accountHolderName + " in " + bankName
				+ " bank is valid and authenticated for issuing the credit card.");
	}

}
