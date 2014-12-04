package com.geekthread.java.guarded.object;

public class ProducerConsumerImpl {
	public static void main(String[] args) {
		Drop drop = new Drop();
		(new Thread(new Producer(drop))).start();
		(new Thread(new Consumer(drop))).start();
	}
}
