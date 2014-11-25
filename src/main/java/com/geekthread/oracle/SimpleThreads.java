package com.geekthread.oracle;

public class SimpleThreads {
	
	
	
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		
		System.out.format("%s: %s%n",
                threadName,
                message);
	}
	
	private static class MessageLoop implements Runnable{

		public void run() {
			String importantInfo[] = {
		                "Mares eat oats",
		                "Does eat oats",
		                "Little lambs eat ivy",
		                "A kid will eat ivy too"
		            };
				
				try{
				for(int i=0;i<importantInfo.length;i++){
					Thread.sleep(4000);
					System.out.println(importantInfo[i]);
				}
				}
				catch(InterruptedException e){
					threadMessage("I was interrupted");
				}
			}
		}


		

	public static void main(String[] args) throws InterruptedException {
		long patience = 1000*60*60;
		if (args.length > 0) {
			try {
				patience = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer!! Exiting now. Try again:)");
				System.exit(-1);
			}

		}
		System.out.println("Patience is:=" + patience  + " milliseconds");
		 threadMessage("Starting MessageLoop thread");
	      long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.setName("SampleThread");
		t.start();
		
		while(t.isAlive()){
			 threadMessage("Still waiting...");
			 t.join(1000);
			 
			 if (((System.currentTimeMillis() - startTime) > patience)
	                  && t.isAlive()) {
	                threadMessage("Tired of waiting!");
	                t.interrupt();
	                // Shouldn't be long now
	                // -- wait indefinitely
	                t.join();
	            }
			 System.out.println("Completeting Alive Loop this time");
		}
		 threadMessage("Finally!");
	}

}
