package br.com.erudio;

public class VeganFood implements Food {
	
	public String prepareFood() {
		return "Vegan Food";
	}

	public double foodPrice() {
		return 50.0;
	}
}