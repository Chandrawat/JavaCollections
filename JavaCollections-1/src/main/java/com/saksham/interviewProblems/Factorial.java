package com.saksham.interviewProblems;

public class Factorial {

	
	public static int findFactorial(int num) {
		int result = 1;
		
		for( int i=1;i<= num; i++) {
			result = result*i;
		}
		
		return result;
	}
	
	public static int recurssive(int num) {
		int result = 1;
		
		if(num == 0) {
			return 1;
		}
		else {
			return (num*recurssive(num-1));
		}		

	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Factorial.findFactorial(5));

		System.out.println(Factorial.recurssive(5));

	}

}
