package com.geekthread.oracle;

public class MySecondRunnable implements Runnable {
	String [] infoMessage = {"EmpId: 1259","EmpName:Rahul Singh","CurrentProject: HSC","Previous Project: NA"};

	public void run() {
		for(int i=0;i <infoMessage.length;i++){
			System.out.println(infoMessage[i]);
		}
		
	}
	

}


