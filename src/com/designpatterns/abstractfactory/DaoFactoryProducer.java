package com.designpatterns.abstractfactory;

public class DaoFactoryProducer {
	public static DaoAbstractfactory produce(String type)
	{
		DaoAbstractfactory dao = null;
		if(type.equalsIgnoreCase("xml"))
			dao = new XMLDaoFactory();
		else if(type.equalsIgnoreCase("DB"))
			dao = new DBDaoFactory();
		return dao;
	}

}
