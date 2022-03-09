package com.designpatterns.singleton;

import java.io.Serializable;

public class DateUtils implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static DateUtils instance;
	
	private DateUtils() {}
	
	public DateUtils getInstance()
	{
		if(instance == null)
		{
			synchronized(DateUtils.class) // if instance is null acquire lock 
			{	
				if(instance == null)
					instance = new DateUtils();
			}
		}
		return instance;
	}
	
	public Object readResolve() // handle the de serialization
	{
		return instance;
	}
	
	@Override
	protected Object clone()
	{
		return new CloneNotSupportedException();
	}

}
