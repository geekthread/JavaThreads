package com.geekthread.oracle;

import java.math.BigDecimal;
import java.math.MathContext;

public class TestSyso {
	public static void main(String[] args) {

		BigDecimal bigDecimal = new BigDecimal(0.6);
		BigDecimal bigDecimal1 = new BigDecimal(0.7);
		MathContext mathContext = new MathContext(4);
		// double d1 = 0.6;
		// double d2 = 0.7;

		System.out.println(bigDecimal.add(bigDecimal1, mathContext));

		// System.out.println((0.6 + 0.7) * 10);
	}

}
