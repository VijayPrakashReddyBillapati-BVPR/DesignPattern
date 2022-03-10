package com.designpatterns.factory;

public class Main {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
		PizzaStore pizza = new PizzaStore(pizzaFactory);
		pizza.orderPizza("chicken");
	}

}
