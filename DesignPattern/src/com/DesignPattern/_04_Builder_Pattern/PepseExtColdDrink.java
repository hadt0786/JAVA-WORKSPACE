package com.DesignPattern._04_Builder_Pattern;

public class PepseExtColdDrink extends ColdDrinkImpleItem {

	
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
