package com.designpatterns.factory;

public class VegPizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println(" preparing Veg Pizza");
	}

	@Override
	public void bakePizza() {
		System.out.println(" bake Veg Pizza");

	}

	@Override
	public void cutPizza() {
		System.out.println(" cut Veg Pizza");

	}

}
