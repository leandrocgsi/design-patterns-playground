package br.com.erudio;

public class ProxyPatternClient {
	
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Leandro Costa");
		access.grantInternetAccess();
	}
}