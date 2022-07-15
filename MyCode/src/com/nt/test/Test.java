package com.nt.test;

import com.nt.beans.Calculator;

public class Test {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(10, 20);
		System.out.println("Sum is: "+sum);
	}
}
