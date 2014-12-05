package com.geekthread.patterns.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaFactoryPatternExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"appContext.xml");
		DogFactory factory = (DogFactory) context.getBean("dogfactory");
		(factory.getDog("small")).speak();
	}
}