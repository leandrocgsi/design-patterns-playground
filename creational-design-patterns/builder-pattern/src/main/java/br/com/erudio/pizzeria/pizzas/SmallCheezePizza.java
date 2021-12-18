package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class SmallCheezePizza extends VeganPizza {

	@Override
	public float price() {
		return 170.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Small size";
	}
}
