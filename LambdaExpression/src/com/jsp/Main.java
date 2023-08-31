package com.jsp;

interface MyInterface {
	void test();
}

public class Main {
	static String name = "Tom";
	double salary = 5000;

	void someMethod() {
		MyInterface myInterface = () -> {
			salary = 5000;
			System.out.println(salary);
		};
	}
	public static void main(String[] args) {
		int x;
		x = 9;

		MyInterface myInterface = () -> {
			int y = 5;
			int z = 6;
			System.out.println(name);
			System.out.println(y + z);
		};

		myInterface.test();
	}
}
