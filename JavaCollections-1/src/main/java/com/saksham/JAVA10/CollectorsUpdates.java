package com.saksham.JAVA10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsUpdates {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(14,34,576,23);
		
		List<Integer> newList = list.stream().filter(i -> i%3==0).collect(Collectors.toUnmodifiableList());
		
		// now If I change this new list will throw exception
		
		newList.add(22);
		
	}

}
