package br.com.erudio.pizzeria;

public abstract class VeganPizza extends Pizza {
	
	@Override
	public abstract float price();

	@Override
	public abstract String name();

	@Override
	public abstract String size();
}