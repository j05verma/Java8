package com.jsp;

public class MainInterface {
	  public static void main(String[] args) {
	    MyInterface5 myInterface = () -> System.out.println(5);
	    myInterface.printNumber();

	    MyInterface2 myInterface2 = (x) -> System.out.println(x);
	    myInterface2.print("java");

	    MyInterface3 myInterface3 = (x, y) -> System.out.println(x+y);
	    myInterface3.add(4, 5);

	    MyInterface4 myInterface4 = (x, y) -> x + y;
	    int result = myInterface4.add(5, 6);
	    System.out.println(result);
	  }
	}
