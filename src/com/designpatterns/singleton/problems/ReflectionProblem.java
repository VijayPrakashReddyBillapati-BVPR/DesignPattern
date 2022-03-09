package com.designpatterns.singleton.problems;

import java.io.Serializable;
import com.designpatterns.singleton.DateUtils;

public class ReflectionProblem implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ReflectionProblem instance;

	private ReflectionProblem() {}

	public static ReflectionProblem getInstance() {
		if (instance == null) {
			synchronized (DateUtils.class) // if instance is null acquire lock
			{
				if (instance == null)
					instance = new ReflectionProblem();
			}
		}
		return instance;
	}

	public Object readResolve() // handle the de serialization
	{
		return instance;
	}

	@Override
	protected Object clone() {
		return new CloneNotSupportedException();
	}
}
