package com.DesignPattern._04_Builder_Pattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		
		meal.addItem(new VegBurgerImpleItem());
		meal.addItem(new CokeExtColdDrink());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		
		meal.addItem(new ChickenBurgerExtBurger());
		meal.addItem((Item) new PepseExtColdDrink());
		return meal;
	}
	
	
	
	
	
}
