package com.jeet.ProducerConsumerThread;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

//Producer Class in Java
class Producer implements Runnable {

	private final BlockingQueue sharedQueue;
	
	public Producer(BlockingQueue sharedQueue)
	{
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try{
				System.out.println("Produced:"+ i);
				sharedQueue.put(i);
				}catch(InterruptedException ex)
			{
				//Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
				ex.printStackTrace();
			}
		}
	}

}
