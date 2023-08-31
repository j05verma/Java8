package com.jsp;

public class MainCalculator {
	public static void myPrint(Calculator calci, double x, double y) {
		double res=calci.calc(x, y);
		System.out.println(res);
	}
	public static void main(String[] args) {
		Calculator add=(x,y)-> x+y;
		myPrint((x,y)-> x+y, 10,5);
		
		// Or
		
		myPrint((x,y)-> x-y, 4,5);
		myPrint((x,y)-> x*y, 4,5);
		myPrint((x,y)-> x/y, 10,5);
	}

}
