package com.producercomsumer;

public class MessageProcessor implements Runnable {

	private int message;

	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		respondToMessage();//make the thread sleep to simulate some work
		System.out.println(Thread.currentThread().getName()+" Done processing"+message);
	}

	private void respondToMessage() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
