package com.Design_a_Logistics_System;

/***
 * 
 * Design a Logistics System (Object Oriented Design). Tell about the different
 * classes and their relationships with each-other. It is not a System Design
 * question, so scope of this question is only to define different classes (with
 * it’s attributes and methods)
 * 
 * Asked In: Adobe
 * 
 * Solution: Let’s assume we want to design a Logistics System with following
 * basic functionality:
 * 
 * • The system can take an order to deliver it to a given destination. • The
 * order will be a list of items and there is a cost of each order to process. •
 * User has to register himself / herself to use this system. • User can track
 * his / her order. • Orders will be shipped by bike or truck, but only a single
 * order will be shipped by a single vehicle.
 * 
 * These type of questions are asked in interviews to Judge the Object Oriented
 * Design skill of a candidate. So, first of all we should think about the
 * classes.
 * 
 * 
 * 
 * The main classes will be:
 * 
 * 1. User 2. Item 3. Vehicle 4. Location 5. PaymentDetails 6. Order 7.
 * LogisticsSystem
 * 
 * 
 * 
 */


import java.util.ArrayList; 
import java.util.Date; 
import java.util.List; 
  
public class Apptest { 
  
    public static void main(String[] args) 
    { 
  
        User user = new User(); 
        user.setUserId(1); 
        user.setName("Shashi"); 
        user.setEmailId("shashi@gmail.com"); 
  
        Item item1 = new Item(); 
        item1.setName("item1"); 
        item1.setPrice(20); 
  
        Item item2 = new Item(); 
        item2.setName("item2"); 
        item2.setPrice(40); 
  
        List<Item> items = new ArrayList<Item>(); 
        items.add(item1); 
        items.add(item2); 
  
        PaymentDetails paymentDetails = new PaymentDetails(); 
        paymentDetails.setAmount(100); 
        paymentDetails.setPaymentMode(PaymentMode.CREDIT_CARD); 
        paymentDetails.setCardNumber("12345678"); 
  
        Location destination = new Location(); 
        destination.setLatitude(73.23); 
        destination.setLongitude(132.34); 
  
        Order order = new Order(); 
        order.setOrderId(1); 
        order.setItems(items); 
        order.setCurrentStatus(OrderStatus.PROCESSING); 
        order.setDestination(destination); 
        order.setPaymentDetails(paymentDetails); 
        order.setTimeOfDelivery(new Date()); 
  
        LogisticsSystem logisticsSystem = new LogisticsSystem(); 
        logisticsSystem.registerNewUser(user); 
        logisticsSystem.takeAnorder(order); 
        logisticsSystem.processOrder(order); 
    } 
} 