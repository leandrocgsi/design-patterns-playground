package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class ExtraLargeNonVeganPizza extends VeganPizza {

	@Override
	public float price() {
		return 250.0f;
	}

	@Override
	public String name() {
		return "Non-Vegan Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}
}