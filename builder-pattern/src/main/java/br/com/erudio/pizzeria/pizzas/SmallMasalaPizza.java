package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class SmallMasalaPizza extends VeganPizza {

	@Override
	public float price() {
		return 100.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Small size";
	}
}