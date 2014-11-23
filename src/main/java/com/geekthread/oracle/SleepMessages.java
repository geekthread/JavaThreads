package com.geekthread.oracle;

public class SleepMessages {

	public static void main(String[] args) throws InterruptedException {
		String[] messages = { "Mares eat oats", "Does eat oats",
				"Little lambs eat ivy", "A kid will eat ivy too" };
		for (int i = 0; i < messages.length; i++) {
			Thread.sleep(4000);
			System.out.println(messages[i]);
		}
	}
}
