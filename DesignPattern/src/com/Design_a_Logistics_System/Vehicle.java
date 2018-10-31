package com.Design_a_Logistics_System;

public class Vehicle {

	private int id, capacity;
	private String vehicleNo;
	private Location currentPosition;
	private VehicleStatus currentStatus;

	public Vehicle(int id, int capacity, String vehicleNo) {
		this.id = id;
		this.capacity = capacity;
		this.vehicleNo = vehicleNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Location getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Location currentPosition) {
		this.currentPosition = currentPosition;
	}

	public VehicleStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(VehicleStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

}
