package com.saksham.JAVA9;

import java.util.List;
import java.util.Set;

public class ListOfUpdate {

	public static void main(String[] args) {
		

			List<String> list = List.of("s","b","c");
			Set<String> set = Set.of("a","b");
			
			System.out.println(list);
			
			list.add("v");
			
/*		The above line will give this
					Exception in thread "main" java.lang.UnsupportedOperationException
						at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
						at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
						at com.saksham.JAVA9.ListOfUpdate.main(ListOfUpdate.java:16)

	*/		
			System.out.println(set);


	}

}
