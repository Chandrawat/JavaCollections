package com.saksham.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListFifthLevel {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(123,12,3,45);
		
		List<Integer> arrayListNumbers = new ArrayList<>(numbers);
		
		
		// Because it implements Integer 
		Collections.sort(arrayListNumbers);
		
		System.out.println(arrayListNumbers);
	}

}
