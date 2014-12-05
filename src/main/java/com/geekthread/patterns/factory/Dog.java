package com.geekthread.patterns.factory;

public abstract class Dog {

	public abstract void speak();

	public enum breedtype {
		SMALL, BIG, WORKING;
	}

	public enum environment {
		SUMMER, WINTER, AUTUMN;
	}

	public enum coatsize {
		THICK, THIN, MEDIUM
	}
}
