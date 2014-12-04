package com.geekthread.patterns.factory;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		constuct();
	}

	@Override
	public void constuct() {
		System.out.println("LUXURY CAR CONSTRUCTED");

	}

}
