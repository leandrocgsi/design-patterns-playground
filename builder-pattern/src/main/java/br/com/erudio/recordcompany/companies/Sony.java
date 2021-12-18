package br.com.erudio.recordcompany.companies;

import br.com.erudio.recordcompany.contract.Company;

public class Sony extends Company {
	
	@Override
	public int price() {
		return 20;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
}
