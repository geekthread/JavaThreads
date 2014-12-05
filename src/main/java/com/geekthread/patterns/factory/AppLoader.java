package com.geekthread.patterns.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppLoader {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		CarFactory factory = (CarFactory) context.getBean("carfactory");
		factory.buildCar(CarType.ALL, true);
	}

}
