package com.geekthread.patterns.factory;

public abstract class Car {
	CarType model;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Car(CarType model) {
		super();
		this.model = model;
		gatherAccessories();
	}

	private void gatherAccessories() {
		System.out.println("Accessories for :=" + this.model);

	}

	public abstract void constuct();

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

}
