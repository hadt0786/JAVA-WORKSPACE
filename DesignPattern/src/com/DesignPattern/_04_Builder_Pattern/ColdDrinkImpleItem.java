package com.DesignPattern._04_Builder_Pattern;

public abstract class ColdDrinkImpleItem {
	
	public Packing packing() {
		return new BottleImplePacking();
	}

	public abstract float price();


}
