package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class LargeMasalaPizza extends VeganPizza {

	@Override
	public float price() {
		return 150.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}
}