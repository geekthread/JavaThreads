package com.geekthread.oracle;

public class TestThreadMethods {
	public static void main(String[] args) {

		MyFirstRunnable obj = new MyFirstRunnable();
		Thread firstThread = new Thread(obj);
		// Thread secondThread = new Thread(new MySecondRunnable());

		Thread secondThread = new Thread(obj);

		firstThread.start();
		secondThread.start();
//		firstThread.start();
		

		try {
			/**
			 * Causes the current thread which maybe firstThread based on the
			 * scheduler to pause until secondThread completes it's execution.
			 * 
			 * Output differs if we start firstThread first and changes on
			 * revering the order of starting the threads. For eg 
			 * EmpId: 1260
			 * EmpName:Ankit Gupta 
			 * CurrentProject: NA 
			 * ++++Second Thread Starts and completes only then first thread resumes and starts working
			 * EmpId: 1259 
			 * EmpName:Rahul Singh
			 * CurrentProject: HSC 
			 * Previous Project: NA 
			 * Previous Project:ExpenseManagement
			 * 
			 */

			secondThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
