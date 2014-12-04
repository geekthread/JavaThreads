package com.geekthread.patterns.factory;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		constuct();
	}

	@Override
	public void constuct() {
		System.out.println("SEDAN CAR CONSTRUCTED");

	}

}
