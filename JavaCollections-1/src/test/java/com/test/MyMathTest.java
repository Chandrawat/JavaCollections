package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.saksham.test.MyMath;

class MyMathTest {
	
	private MyMath math = new MyMath();

	@Test
	void test_Zero() {
		int[] numbers = {};
		//MyMath math = new MyMath();
		int results = math.calculateSum(numbers);
		//System.out.println(results);
		int expectedResult = 0;
		assertEquals(results, expectedResult);
	}
	
	@Test
	void calculateSum_threeNumbers() {
		// int[] numbers = {1,2,3};
		//MyMath math = new MyMath();
		int results = math.calculateSum(new int[] {1,2,3});
		//System.out.println(results);
		int expectedResult = 6;
		assertEquals(results, expectedResult);
	}
	
	@Test
	void calculateSum_fourNumbers() {
		int results = math.calculateSum(new int[] {1,2,3,1});
		assertEquals(7, results);
	}

}
