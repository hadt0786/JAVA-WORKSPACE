package com.DesignPattern._04_Builder_Pattern;

public abstract class BurgerImpleItem implements Item {

	@Override
	public Packing packing() {
		return new WrapperImplePacking();
	}

	@Override
	public abstract float price();

}
