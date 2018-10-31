
package com.producercomsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	ExecutorService executor = Executors.newFixedThreadPool(2);
	
	Runnable processor = new MessageProcessor(2);
	executor.execute(processor);
	
	Runnable processor2 = new MessageProcessor(3);
	executor.execute(processor2);
	
	Runnable processor3 = new MessageProcessor(4);
	executor.execute(processor3);
	
	executor.shutdown();//rejects any new task from  being submitted
	
	
	
	
}
