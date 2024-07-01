package com.saksham.collections;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Banana", "Coconut");
		System.out.println(words.size());
		System.out.println(words.contains("Apple"));
		System.out.println(words.contains("dog"));
		System.out.println(words.get(0));
		System.out.println(words.indexOf("Banana"));
		
		
		List<String> wordArrayList = new ArrayList<>(words);
		System.out.println(wordArrayList);
		
		wordArrayList.add("Kiwi");
		
		System.out.println(wordArrayList);
		
		// Add at particular index
		
		wordArrayList.add(2,"Orange");
		
		System.out.println(wordArrayList);
		
		// can have duplicates
		wordArrayList.add("Kiwi");
		System.out.println(wordArrayList);

		// adding one list to another
		List<String> animals = List.of("Lion", "Bull");
		
		// need to use add ALl not only add 
		wordArrayList.addAll(animals);
		System.out.println(wordArrayList);

		// setting the values 
		wordArrayList.set(5, "Blueberry");
		System.out.println(wordArrayList);

		// remove at 1 index
		wordArrayList.remove(1);
		System.out.println(wordArrayList);

		wordArrayList.remove("Lion");
		System.out.println(wordArrayList);

	}

}
