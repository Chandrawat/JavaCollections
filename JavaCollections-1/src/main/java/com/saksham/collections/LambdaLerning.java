package com.saksham.collections;

public class LambdaLerning {

	
	
	// convert into Lambda function from normal function
/*	public void myMethod() {
		System.out.println("Simple Method");
	}
	
	  () -> System.out.println("Simple Method");
	
	*/
	
	//convert to lambda
/*	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	  (int a,int b) -> System.out.println(a+b);
	  
	  // change to 
	  
	  (a,b) -> System.out.println(a+b);
	*/
	
/*	public int length(String s) {
		return s.length();
	}
	
	  (String s) -> return s.length();
	
	  (s) ->  s.length();

	  s ->  s.length();

	  */

	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("This thread is running!");
			
		Thread th = new Thread(runnable);
		th.start();

		

	}


}
