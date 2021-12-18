package br.com.erudio.pizzeria.drink;

import br.com.erudio.pizzeria.ColdDrink;

public abstract class Coke extends ColdDrink {
    
    @Override
    public abstract  String name();

    @Override
    public abstract  String size();
    
    @Override
    public abstract  float price(); 
}