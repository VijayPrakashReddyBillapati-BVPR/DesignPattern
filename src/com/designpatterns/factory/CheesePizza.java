package com.designpatterns.factory;

public class CheesePizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println(" preparing Cheese Pizza");
	}

	@Override
	public void bakePizza() {
		System.out.println(" bake Cheese Pizza");

	}

	@Override
	public void cutPizza() {
		System.out.println(" cut Cheese Pizza");

	}

}
