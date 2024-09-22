package com.saksham.interviewProblems;

import java.util.Arrays;

public class MaxMinimum {

    public static int[] findMaxMin(int[] myList){
        int maxiMum= myList[0];
        int miniMum= myList[0];
        for(int num: myList){
            if(num > maxiMum){
                maxiMum= num;
            }
            else if(num < miniMum){
                miniMum = num;
            }
        }
        return new int[] {
            maxiMum, miniMum
        };
}
    public static String findLongestString(String[] stringList)
    {
        String longestString = "";
       
        for(String str: stringList)
        {
            if(str.length()> longestString.length()){
                
                longestString= str;
            }
        }
        return longestString;
    }
    
    
    
	public static void main(String[] args) {
		
        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"


	}

}
