package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class MediumMasalaPizza extends VeganPizza {

	@Override
	public float price() {
		return 120.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Medium size";
	}
}