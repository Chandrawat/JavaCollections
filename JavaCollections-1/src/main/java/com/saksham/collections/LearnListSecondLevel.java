package com.saksham.collections;

import java.util.Iterator;
import java.util.List;

public class LearnListSecondLevel {

	public static void main(String[] args) {

		List<String> randomWords = List.of("Apple", "Orange", "Honda", "Car");

		// basic For Loop
		for (int i = 0; i < randomWords.size(); i++) {
			System.out.println(randomWords.get(i));
		}

		// Enhanced For Loop
		for (String rn : randomWords) {
			System.out.println(rn);
		}

		// Iterator
		Iterator<String> wordItr = randomWords.iterator();
		while (wordItr.hasNext()) {
			System.out.println(wordItr.next());

		}
		
		
		practiseMethod();

	}

	private static void practiseMethod() {
		
		List<Integer> randomNumners = List.of(1,2,3,4,5,6,7);
		
		
		for(int i=0;i<randomNumners.size();i++) {
			System.out.println(randomNumners.get(i));
		}
		
		
		for(Integer i: randomNumners) {
			System.out.println(i);
		}
		
		Iterator<Integer> ii =  randomNumners.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
	}
	
	

}
