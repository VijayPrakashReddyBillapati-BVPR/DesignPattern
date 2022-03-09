package com.designpatterns.singleton.issues;

import java.io.Serializable;

import com.designpatterns.singleton.DateUtils;

public class DateUtilsSerialization  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static DateUtilsSerialization instance;
	
	private DateUtilsSerialization() {}
	
	public static DateUtilsSerialization getInstance()
	{
		if(instance == null)
		{
			synchronized(DateUtils.class)
			{	
				if(instance == null)
					instance = new DateUtilsSerialization();
			}
		}
		return instance;
	}

}
