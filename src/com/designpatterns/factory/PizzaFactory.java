package com.designpatterns.factory;

public class PizzaFactory {
	public Pizza createPizza(String name)
	{
		Pizza pizza = null;
		if(name.equalsIgnoreCase("cheese"))
			pizza = new CheesePizza();
		else if(name.equalsIgnoreCase("veg"))
			pizza = new VegPizza();
		else if(name.equalsIgnoreCase("chicken"))
			pizza = new ChickenPizza();
		
		return pizza;
	}

}
