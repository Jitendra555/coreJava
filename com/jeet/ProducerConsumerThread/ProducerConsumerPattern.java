package com.jeet.ProducerConsumerThread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.jeet.blockingqueue.Consumer;
import com.jeet.blockingqueue.Producer;

public class ProducerConsumerPattern {

	public static void main(String[] args){
	//Creating shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		
	//Creating Producer and Consumer thread
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));
		
	//Starting producer and Consumer thread
		prodThread.start();
		consThread.start();
		
	}

}
