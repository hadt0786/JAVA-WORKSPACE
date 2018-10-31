package com.DesignPattern._04_Builder_Pattern;

public class ChickenBurgerExtBurger extends BurgerImpleItem {

	@Override
	public String name() {
		return "CHicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
