package com.saksham.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnListThirdLevel {
		

	public static void main(String[] args) {
		

		List<String> words = List.of("Ate", "Bag", "Cat");
		
		List<String> arrayListOfWords = new ArrayList<>(words);
		
		// Task: to print words ending with at
		
		for(String w: arrayListOfWords) {
			if(w.endsWith("at")) {
				System.out.println(w);
			}
		}
		
		// Below code will give ConcurrentModificationException so to avoid it will use Iterator
//		 for( String w:arrayListOfWords) {
//			 if(w.endsWith("at")) {
//				 arrayListOfWords.remove(w);
//			 }
//		 }
		// System.out.println(arrayListOfWords);
	

	Iterator<String> itr = arrayListOfWords.iterator();
		while(itr.hasNext()) {
		 if(itr.next().endsWith("at")) {
			 itr.remove();
		 }
		}
	System.out.println(arrayListOfWords);
	}

}
