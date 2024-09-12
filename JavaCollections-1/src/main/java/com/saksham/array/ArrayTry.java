package com.saksham.array;

public class ArrayTry {

	public static void main(String[] args) {
		
		int[] price = {1,2,3,4,55,5,33,52,52,34,3};

		//int[] array = new int[L];
		
		int avg, sum = 0;
		
		for(int i=0; i<price.length;i++) {
			sum+= price[i];
		}
		avg= sum/price.length;
		
		System.out.println(avg);

	}

}
