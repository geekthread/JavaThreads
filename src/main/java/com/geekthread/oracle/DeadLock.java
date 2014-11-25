package com.geekthread.oracle;

public class DeadLock {

	static class Friend {
		private final String name;

		public Friend(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void bow(Friend bower) {

			// System.out.println(this.name);
			System.out.format("%s: %s" + "  has bowed to me!%n", this.name,
					bower.getName());

			// Ankit;
			bower.bowBack(this);
		}

		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s" + " has bowed back to me!%n", this.name,
					bower.getName());
		}

		public static void main(String[] args) {
			final Friend alphonse = new Friend("Alphonse");
			final Friend gaston = new Friend("Gaston");

			Thread t1 = new Thread(new Runnable() {
				public void run() {
					alphonse.bow(gaston);
				}
			});

			Thread t2 = new Thread(new Runnable() {
				public void run() {
					gaston.bow(alphonse);
				}
			});

			t1.start();
			t2.start();
		}
	}
}