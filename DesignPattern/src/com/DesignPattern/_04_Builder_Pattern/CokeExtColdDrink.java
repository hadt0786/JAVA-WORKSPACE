package com.DesignPattern._04_Builder_Pattern;

public class CokeExtColdDrink extends ColdDrinkImpleItem implements Item {

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
