package com.DesignPattern._04_Builder_Pattern;

public class VegBurgerImpleItem extends BurgerImpleItem {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
