package com.designpatterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println(" preparing Chicken Pizza");
	}

	@Override
	public void bakePizza() {
		System.out.println(" bake Chicken Pizza");

	}

	@Override
	public void cutPizza() {
		System.out.println(" cut Chicken Pizza");

	}

}
