package com.Entity;

public class Product {

	private String id, name, manufacturer;
	private long price;
	private int quatity;

	public String getId() {
		return id;
	}

	public Product(String id, String name, String manufacturer, long price, int quatity) {
		// super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.quatity = quatity;
	}

	public Product() {

	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "id=" + id + "\nName=" + name;
	}

}
