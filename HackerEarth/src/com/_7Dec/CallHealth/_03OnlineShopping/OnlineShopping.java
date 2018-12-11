package com._7Dec.CallHealth._03OnlineShopping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Online shopping
 **/

public class OnlineShopping {

	public static Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	public static PrintWriter cout = new PrintWriter(System.out, true);

	public class Item {
		String name;
		double discount;

		public Item(String name, double discount) {
			this.name = name;
			this.discount = discount;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

//		@Override
//		public String toString() {
//			return name + " " + discount;
//		}
	}

	public class Customer implements Comparator {
		int ID;
		double bill;
		boolean voucher;

		public Customer(int iD, double bill, boolean v) {
			ID = iD;
			this.bill = bill;
			voucher = v;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (ID != other.ID)
				return false;
			return true;
		}

		public int compare(Object arg0, Object arg1) {
			Customer c1 = (Customer) arg0;
			Customer c2 = (Customer) arg1;
			if (c2.bill == c1.bill) {
				return (int) (c2.ID - c1.ID);
			} else
				return (int) (c2.bill - c1.bill);
		}

		@Override
		public String toString() {
			return ID + " " + String.format("%.2f", bill);
		}

	}

	public class Bills {
		private List<Customer> customers = new LinkedList<Customer>();
		private List<Item> inventory = new LinkedList<Item>();
		private double A;

		public List<Item> getInventory() {
			return inventory;
		}

		public void setInventory(List<Item> inventory) {
			this.inventory = inventory;
		}

		public double getA() {
			return A;
		}

		public void setA(double a) {
			A = a;
		}

		public boolean customerExists(int id) {
			return customers.contains(new Customer(id, 0, false));
		}

		public Item getItem(String name) {
			return inventory.get(itemIndex(name));
		}

		public Customer getCustomer(int id, String voucher) {
			if (customerExists(id)) {
				return customers.get(index(id));
			} else {
				boolean v = false;
				if (voucher.toLowerCase().equals("yes")) {
					v = true;
				}
				Customer newCust = new Customer(id, 0, v);
				customers.add(newCust);
				return newCust;
			}
		}

		public int index(int id) {
			return customers.indexOf(new Customer(id, 0, false));
		}

		public int itemIndex(String name) {
			return inventory.indexOf(new Item(name, 0));
		}

		public void addAmount(int id, String item, double d, double amt, String voucher) {
			Customer c = getCustomer(id, voucher);
			Item i = getItem(item);
			c.bill += amt * d * (1 - i.discount / 100.00);
		}

		public void getBills() {
			Customer c = customers.get(0);
			for (int i = 0; i < customers.size(); i++) {
				c = customers.get(i);
				if (c.voucher)
					c.bill -= A;
			}
			customers.sort(c);
			for (int i = 0; i < customers.size(); i++) {
				// System.out.println(customers.get(i));
				cout.println(customers.get(i));
			}
		}

	}

	public static void close() {
		cin.close();
		cout.close();
	}

// TEST CASES
// 3
//	clothes 20.00
//	electronis 50.00
//	groceries 50.00
//	100.00
//	4
//	1 clothes 1 600.00 YES
//	3 electronics 2 5000.00 NO
//	1 groceries 1 100.00 YES
//	2 clothes 2 500.00 NO
//	

	public static void main(String[] args) throws Exception {

		int N = cin.nextInt();
		OnlineShopping.Bills bills = new OnlineShopping().new Bills();
		List<Item> inventory = bills.getInventory();
		for (int i = 0; i < N; i++) {
			String input = cin.next();
			String dis = cin.next();
			inventory.add(new OnlineShopping().new Item(input, Double.parseDouble(dis)));
		}

		bills.setA(cin.nextDouble());
		int M = cin.nextInt();
		for (int i = 0; i < M; i++) {
			bills.addAmount(cin.nextInt(), cin.next().toLowerCase().trim(), cin.nextDouble(), cin.nextDouble(),
					cin.next().toLowerCase());
		}
		bills.getBills();
		close();
	}

}
