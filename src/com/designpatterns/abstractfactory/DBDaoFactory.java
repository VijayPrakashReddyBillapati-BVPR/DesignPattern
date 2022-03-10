package com.designpatterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractfactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type.equalsIgnoreCase("emp"))
			dao = new DBEmpDao();
		else if(type.equalsIgnoreCase("dept"))
			dao = new DBDeptDao();
		
		return dao;
	}



}
