package com.producercomsumer;

import java.util.concurrent.BlockingQueue;


public class COnsumer implements Runnable{
BlockingQueue<Integer> questionQueue;
	
	public COnsumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}
	
	
	public void run() {
		
	}
}
