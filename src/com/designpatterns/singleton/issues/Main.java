package com.designpatterns.singleton.issues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtilsSerialization DateUtils =  DateUtilsSerialization.getInstance();
		String path = "dateutils.ser";
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(new File(path)));
		oss.writeObject(DateUtils);
		oss.close();
		
		DateUtilsSerialization DateUtils1 =  null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
		DateUtils1 = (DateUtilsSerialization) ois.readObject();
		ois.close();

		System.out.println(DateUtils == DateUtils1);
		
		
		ReflectionProblem dateutils3 = ReflectionProblem.getInstance();
		ReflectionProblem dateutils2 = null;
		Constructor[] constructors = ReflectionProblem.class.getDeclaredConstructors();
		for(Constructor Constructor : constructors)
		{
			Constructor.setAccessible(true);
			try {
				dateutils2 =  (ReflectionProblem) Constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(dateutils3.hashCode());
		System.out.println(dateutils2.hashCode());
	}

}
