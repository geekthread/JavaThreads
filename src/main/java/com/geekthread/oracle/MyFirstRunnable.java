
package com.geekthread.oracle;

/**
 * @author ankit.gupta1
 *
 */
public class MyFirstRunnable implements Runnable {

	String[] infoMessage = { "EmpId: 1260", "EmpName:Ankit Gupta",
			"CurrentProject: NA", "Previous Project: ExpenseManagement" };

	public void run() {
		for (int i = 0; i < infoMessage.length; i++) {
			System.out.println(infoMessage[i]);
		}

	}

}
