package com.geekthread.patterns.factory;

import java.util.ArrayList;

public class CarFactory {

	public static ArrayList<Car> buildCar(CarType model, boolean createAll) {
		Car car = null;
		ArrayList<Car> carList = new ArrayList<Car>();

		if (!createAll) {
			switch (model) {
			case SMALL:
				car = new SmallCar();
				break;
			case LUXURY:
				car = new LuxuryCar();
				break;
			case SEDAN:
				car = new SedanCar();
				break;

			default:
				break;
			}
			carList.add(car);
		} else {
			for (CarType type : CarType.values()) {
				if (!type.toString().equalsIgnoreCase("ALL")) {
					carList.add(buildCar(type, false).get(0));
				}

			}
		}

		return carList;
	}

}
