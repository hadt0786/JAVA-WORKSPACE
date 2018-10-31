package com.DesignPattern._04_Builder_Pattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("veg Meal");
		
		vegMeal.showItem();

		System.out.println("the Total bill is "+vegMeal.getCost());

		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();

		System.out.println("non veg Meal");

		System.out.println(" The Bill : "+nonvegMeal.getCost());

	}

}
