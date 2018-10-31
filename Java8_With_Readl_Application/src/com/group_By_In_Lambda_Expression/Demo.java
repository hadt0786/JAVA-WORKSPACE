package com.group_By_In_Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.Entity.Product;

public class Demo {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();

		products.add(new Product("p01", "mobile1", "Manufatirer 1", 1, 1000));
		products.add(new Product("p02", "mobile2", "Manufatirer 2", 2, 2000));
		products.add(new Product("p03", "mobile3", "Manufatirer 3", 3, 3000));
		products.add(new Product("p04", "mobile4", "Manufatirer 4", 4, 4000));
		products.add(new Product("p05", "mobile5", "Manufatirer 5", 5, 5000));

		System.out.println("Count the number of products in each group");

		Map group = products.stream().collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));

		for (String groupName : group.keySet()) {
			System.out.println("group name " + groupName);
			System.out.println("Product " + group.get(groupName));
			System.out.println("=====================");

		}

		System.out.println("calculate the total number of products in each group");
		Map calculateGroup = products.stream()
				.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.summingInt(Product::getQuantity)));

		for (String groupName : calculateGroup.keySet()) {
			System.out.println("group name " + groupName);
			System.out.println("Total number of Products " + calculateGroup.get(groupName));
			System.out.println("=====================");

		}
	}

}
