package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos =Arrays.asList("JAVA", "AWS","DBMS");
	
	@Test
	void test() {
		boolean test = todos.contains("AWS");
		//assertEquals(true, test);
		//assertEquals(3,todos.size());
		//assertEquals(3,todos.size(), " size is not 3"); 		//can put error message in case if fails
		//assertTrue("Something went wrong",test);		// only for boolean values
		//assertFalse(test); to make failure 
		//assertNull(todos);
		//assertNotNull(todos);
	
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
	}

}
