package com.designpatterns.factory;

public class PizzaStore {
	Pizza pizza = null;
	public void orderPizza(String name)
	{
		pizza = PizzaFactory.createPizza(name);
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();
	}

}
