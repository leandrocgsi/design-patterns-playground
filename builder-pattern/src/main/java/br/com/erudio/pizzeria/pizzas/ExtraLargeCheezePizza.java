package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class ExtraLargeCheezePizza extends VeganPizza {

	@Override
	public float price() {
		return 300.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}
}