package com.geekthread.patterns.factory;

import java.util.ArrayList;

public class TestCarFactory {
	public static void main(String[] args) {
		ArrayList<Car> cars = CarFactory.buildCar(CarType.ALL, true);
		System.out.println(cars);
	}

}
