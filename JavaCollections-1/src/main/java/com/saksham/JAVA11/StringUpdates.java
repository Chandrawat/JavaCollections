package com.saksham.JAVA11;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringUpdates {

	public static void main(String[] args) {
		

		String str= "     ";
		System.out.println(str.isBlank());	// java 11
		System.out.println(str.isEmpty());	// java 6
		
		str = "I \nam \nSaksham \nSt Louis";
		System.out.println(str);
		
		System.out.println(str.lines().collect(Collectors.toList()));

		str = " I am sakshammmm ejfwf wjefow ";
		System.out.println(str);
		char c = '\u2000';
		str = c+ str+c;
		System.out.println(str.strip());
		
		int n= 5;
		System.out.println("Write this n number of times \n".repeat(n));
	}

}
