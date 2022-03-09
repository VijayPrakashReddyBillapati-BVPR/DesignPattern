package com.designpatterns.singleton.problems;

public class DateUtilsMultithread {
	private static DateUtilsMultithread instance;
	
	private DateUtilsMultithread() {}
	
	public DateUtilsMultithread getInstance()
	{
		if(instance == null)
			instance = new DateUtilsMultithread();
		return instance;
	}
}
