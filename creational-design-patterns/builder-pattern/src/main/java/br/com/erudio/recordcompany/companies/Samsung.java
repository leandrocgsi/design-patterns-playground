package br.com.erudio.recordcompany.companies;

import br.com.erudio.recordcompany.contract.Company;

public class Samsung extends Company {
	
	@Override
	public int price() {
		return 15;
	}

	@Override
	public String pack() {
		return "Samsung CD";
	}
}
