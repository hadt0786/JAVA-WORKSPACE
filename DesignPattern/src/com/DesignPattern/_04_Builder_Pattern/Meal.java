package com.DesignPattern._04_Builder_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItem() {
		for(Item item : items) {
			System.out.print(" Item name  : " +item.name());
			System.out.print(", P  : " +item.packing().pack());
			System.out.print(", Item Price  : " +item.price());
		}
		
	}
}
