package com.designpatterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		DaoAbstractfactory produce = DaoFactoryProducer.produce("db");
		Dao dao = produce.createDao("dept");
		dao.save();
	}

}
