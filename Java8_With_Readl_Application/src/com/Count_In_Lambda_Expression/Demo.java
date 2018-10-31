package com.Count_In_Lambda_Expression;

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

		long result = products.stream().filter(p -> p.getPrice() > 700).count();
		System.out.println("result : " + result);

	}

}
