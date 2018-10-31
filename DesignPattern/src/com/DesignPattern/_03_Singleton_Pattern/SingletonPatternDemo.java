package com.DesignPattern._03_Singleton_Pattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		// illegal construct 
		
		// compile time error
		
		//SingleObject object = SingleObject();
		
		// get the only objects available
		
		SingleObject object = SingleObject.getInstance();
		
		// show message
		
		object.showMessage();
		
		
	}

}
