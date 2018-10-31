package com.Design_a_Logistics_System;

public class Truck extends Vehicle {
	private final static int capacityOfTruck = 10;

	public Truck(int id, String vehicleNo) {
		super(id, capacityOfTruck, vehicleNo);
	}

}
