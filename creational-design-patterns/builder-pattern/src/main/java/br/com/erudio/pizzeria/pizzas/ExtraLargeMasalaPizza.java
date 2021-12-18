package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class ExtraLargeMasalaPizza extends VeganPizza {

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}
}