package com.DesignPattern._03_Singleton_Pattern;

public class SingleObject {

	// create an object of SingleObject

	private static SingleObject instance = new SingleObject();

	// make the constructor private so this class cannot be instantiated

	private SingleObject() {
	}

	// get the only objects values

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World");
	}
}
