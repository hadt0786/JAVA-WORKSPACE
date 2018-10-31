package com.use_Limit_Operator_In_Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Product;

public class Demo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();

		products.add(new Product("p01", "mobile1", "Manufatirer 1", 1, 1000));
		products.add(new Product("p02", "mobile2", "Manufatirer 2", 2, 2000));
		products.add(new Product("p03", "mobile3", "Manufatirer 3", 3, 3000));
		products.add(new Product("p04", "mobile4", "Manufatirer 4", 4, 4000));
		products.add(new Product("p05", "mobile5", "Manufatirer 5", 5, 5000));

		System.out.println("Descending order and limit");

		products.stream().sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice())).forEach(p -> {
			System.out.println(p.toString());
			System.out.println("=====================");
		});

	}

}