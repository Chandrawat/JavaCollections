package com.saksham.java8;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		MyIntefaceDemo inter = ()-> System.out.println("Interface menthod called");

		 inter.myMethod();
	}

}

@FunctionalInterface
interface MyIntefaceDemo{
	public abstract void myMethod();
	public default void add() {
		
	}
}
