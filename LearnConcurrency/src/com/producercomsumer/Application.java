package com.producercomsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
	
	public static void main(String[] args) {
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);// 5 is the maximum capacity
		
		Thread t1 = new Thread(new Producer());
		Thread t2 = new Thread(new COnsumer());
		
		t1.start();
		t2.start();
		
	}

}
