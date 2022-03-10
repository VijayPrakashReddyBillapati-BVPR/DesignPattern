package com.designpatterns.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to Data Base");
		
	}

}
