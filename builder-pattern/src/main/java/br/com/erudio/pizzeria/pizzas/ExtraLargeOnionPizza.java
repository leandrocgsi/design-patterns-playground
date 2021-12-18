package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class ExtraLargeOnionPizza extends VeganPizza {

	@Override
	public float price() {
		return 200.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}
}