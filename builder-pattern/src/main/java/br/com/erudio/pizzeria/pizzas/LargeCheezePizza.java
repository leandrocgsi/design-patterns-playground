package br.com.erudio.pizzeria.pizzas;

import br.com.erudio.pizzeria.VeganPizza;

public class LargeCheezePizza extends VeganPizza {

	@Override
	public float price() {
		return 260.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}
}