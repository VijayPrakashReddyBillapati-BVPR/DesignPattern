package com.designpatterns.singleton;

public class TestEnumSingleTon {

	public static void main(String[] args) {
		EnumDateutil instance = EnumDateutil.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Vijay");
		System.out.println(instance.getName());
	}

}
