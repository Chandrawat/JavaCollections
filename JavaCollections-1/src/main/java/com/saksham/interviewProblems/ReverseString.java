package com.saksham.interviewProblems;

public class ReverseString {

	
	public static String reverse(String input) {
		String result = "";
		
		for(int i= input.length()-1;i>=0;i--) {
			result= result+ input.charAt(i);
		}
		System.out.println(result);
		return result;
	}
	
	public static boolean isPallindrome(String input) {
		String compare ="";
		if(input== null) {
			throw new IllegalArgumentException("can not be null");
		}
		
		StringBuilder stringBuilder = new StringBuilder(input);
		
		//another way
		//compare= stringBuilder.reverse().toString();
		
		System.out.println(compare);
		for(int i=input.length()-1; i>=0;i--) {
			compare = compare+input.charAt(i);
		}
		if(input.equals(compare)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		reverse("Saksham");
		System.out.println(isPallindrome("220022"));
	}

}
