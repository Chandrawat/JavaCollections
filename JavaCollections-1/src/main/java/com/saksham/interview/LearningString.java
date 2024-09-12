package com.saksham.interview;

public class LearningString {

	public static void main(String[] args) {
		
		String s1= "abcd";
		String s2= "ab" + "cd";
		
		String s3 = new String("abcd");
		
		String s4 = new String("abcd");
				
		
		int a1= 4;
		int a2= 4;
		/*
		if(s1==s2)
		{
			System.out.println(s1 +" == return true");
		}
		
		if(s1.equals(s3))
		{
			System.out.println(s1 +" .equals return true");
		}
		*/
		if(s1==s3)
		{
			System.out.println(s1 +"s1 s3 == return true");
		}
		
		if(s3.equals(s4))
		{
			System.out.println(" s3-s4 3.4 .equals return true");
		}
		
		if(s3==s4)
		{
			System.out.println(s3 +" 3.4 ==return true");
		}
		
		if(a1==a2)
		{
			System.out.println(a1+ " == return true");
		}
	}

}
