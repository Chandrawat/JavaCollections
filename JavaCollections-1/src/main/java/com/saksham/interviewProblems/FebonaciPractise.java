package com.saksham.interviewProblems;

public class FebonaciPractise {
	
	
	private static int Calculatefebo(int size) {
		int result=0, a=0,b=1;
		System.out.print(a +" "+ b);
		for(int i=0;i<size;i++) {
			result = a+b;
			System.out.print(" "+result);
			a= b;
			b= result;
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		
		Calculatefebo(20);
				
	
	}

}
