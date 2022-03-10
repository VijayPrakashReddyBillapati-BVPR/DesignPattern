package com.designpatterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractfactory{

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type.equalsIgnoreCase("emp"))
			dao = new XMLEmpDao();
		else if(type.equalsIgnoreCase("dept"))
			dao = new XMLDeptDao();
		
		return dao;
	}

	
}
