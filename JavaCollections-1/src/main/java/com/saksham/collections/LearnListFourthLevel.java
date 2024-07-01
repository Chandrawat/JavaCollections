package com.saksham.collections;

import java.util.List;

public class LearnListFourthLevel {

	public static void main(String[] args) {
		
		List values = List.of("A",1,1.0,"B");
		
		System.out.println(values);

		System.out.println(values.get(0));
		
		System.out.println(values.get(0).getClass());

		System.out.println(values.get(1).getClass());

		System.out.println(values.get(2).getClass());

		// Java is autoboxing the values in String, Integer and Double 
		// the opposite is Generic where we specify type in List<String>
		
		System.out.println(values.indexOf(1));
		
		System.out.println(values.indexOf(1.0));
		
		//if you want to remove any values from list
		
		//values.remove(2);
		// this will give java.lang.UnsupportedOperationException
		// because remove takes Index in "int" not Integer or Object type
		// here we need to get value of Integer which takes value in int format 
		values.remove(Integer.valueOf(2));
		
	}

}
