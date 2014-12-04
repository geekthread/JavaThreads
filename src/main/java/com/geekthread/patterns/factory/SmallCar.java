package com.geekthread.patterns.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		constuct();
	}

	@Override
	public void constuct() {
		System.out.println("SMALL CAR CONSTRUCTED");

	}

}
