package com.saksham.JAVA9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIUpdates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,4,5,6,3,5,3, null ,52,4,56,6,3,null, 6,3);
		
		System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
		
		System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));

		System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));

		
	}

}
