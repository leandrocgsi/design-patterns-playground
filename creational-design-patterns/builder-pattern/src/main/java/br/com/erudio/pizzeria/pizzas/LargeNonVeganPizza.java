package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class LargeNonVeganPizza extends VeganPizza {

	@Override
	public float price() {
		return 220.0f;
	}

	@Override
	public String name() {
		return "Non-Vegan Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}
}