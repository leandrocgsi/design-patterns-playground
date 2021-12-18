package br.com.erudio.recordcompany;

import br.com.erudio.recordcompany.cd.CDType;
import br.com.erudio.recordcompany.companies.Samsung;
import br.com.erudio.recordcompany.companies.Sony;

public class CDBuilder {
	
	public CDType buildSonyCD() {
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}

	public CDType buildSamsungCD() {
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}
}
