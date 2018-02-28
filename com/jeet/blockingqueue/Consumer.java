package com.jeet.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("consume:"+queue.take());
            System.out.println("consume:"+queue.take());
            System.out.println("consume:"+queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}