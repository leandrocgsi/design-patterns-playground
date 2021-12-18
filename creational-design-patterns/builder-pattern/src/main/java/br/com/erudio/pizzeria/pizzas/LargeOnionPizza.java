package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class LargeOnionPizza extends VeganPizza {

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}
}