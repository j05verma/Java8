package com.jsp;

@FunctionalInterface
interface MyInterface5{
  void printNumber();
  // default methods allowed
  // static methods allowed
  // private methods allowed
}

interface MyInterface2{
  void print(String name);
}

interface MyInterface3{
  void add(int x, int y);
}

interface MyInterface4{
  int add(int x, int y);
}