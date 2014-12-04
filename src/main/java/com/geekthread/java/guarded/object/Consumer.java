package com.geekthread.java.guarded.object;

import java.util.Random;

public class Consumer implements Runnable {
	private Drop drop;

	public Consumer(Drop drop) {
		super();
		this.drop = drop;
	}

	public void run() {
		Random random = new Random();
		for(String message = drop.take(); !message.equals("DONE");message=drop.take()){
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
