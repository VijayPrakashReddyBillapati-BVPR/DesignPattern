package com.designpatterns.factory;

public class PizzaStore {
	Pizza pizza = null;
	PizzaFactory pizzaFactory;
	public PizzaStore(PizzaFactory pizzaFactory)
	{
		this.pizzaFactory = pizzaFactory;
	}
	
	public void orderPizza(String name)
	{
		pizza = pizzaFactory.createPizza(name);
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();
	}

}
