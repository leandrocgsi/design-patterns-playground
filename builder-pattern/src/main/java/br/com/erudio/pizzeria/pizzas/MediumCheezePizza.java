package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class MediumCheezePizza extends VeganPizza {

	@Override
	public float price() {
		return 220.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Medium size";
	}
}