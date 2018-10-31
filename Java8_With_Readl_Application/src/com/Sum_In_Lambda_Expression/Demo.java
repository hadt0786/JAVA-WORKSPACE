package com.Sum_In_Lambda_Expression;

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

		int s1 = products.stream().mapToInt(p -> p.getQuatity()).sum();

		System.out.println("Sum of all quantity starts with mobile " + s1);

		int s2 = products.stream().filter(p -> p.getName().startsWith("mobile")).mapToInt(p -> p.getQuatity()).sum();

		System.out.println("Sum of all quantity " + s2);

		long s3 = products.stream().mapToLong(p -> p.getQuatity() * p.getPrice()).sum();

		System.out.println("Total " + s3);

	}

}
