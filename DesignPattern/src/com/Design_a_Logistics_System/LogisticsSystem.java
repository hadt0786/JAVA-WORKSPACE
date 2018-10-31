package com.Design_a_Logistics_System;

import java.util.ArrayList;
import java.util.List;

public class LogisticsSystem {

	private List<Order> orders;
	private List<Vehicle> vehicles;
	private List<User> users;

	public LogisticsSystem() {

		this.orders = new ArrayList<Order>();
		this.vehicles = new ArrayList<Vehicle>();
		this.users = new ArrayList<User>();
	}

	public void takeAnorder(Order order) {
		System.out.println("Adding an Order");
		orders.add(order);
	}

	public void processOrder(Order order) {
		System.out.println("Processing an order of the system");
	}

	public Location trackOrder(int orderId) {
		System.out.println("Tracking an order of the system");
		Location location = null;
		// location = findLocationOdGivenOrder();

		return location;

	}

	public void cacelOrder(Order order) {
		System.out.println("Going to cancell an order of the system");
	}

	public void registerNewUser(User user) {
		System.out.println("Registering a new user to the system");
		users.add(user);
	}
	public List<Order> getOrders() 
    { 
        return orders; 
    } 
  
    public void setOrders(List<Order> orders) 
    { 
        this.orders = orders; 
    } 
  
    public List<Vehicle> getVehicles() 
    { 
        return vehicles; 
    } 
  
    public void setVehicles(List<Vehicle> vehicles) 
    { 
        this.vehicles = vehicles; 
    } 
  
    public List<User> getUsers() 
    { 
        return users; 
    } 
  
    public void setUsers(List<User> users) 
    { 
        this.users = users; 
    } 
} 


