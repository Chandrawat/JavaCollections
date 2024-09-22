package com.saksham.interviewProblems;

import java.util.HashSet;

public class FindDuplicates {
	
	// Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {

    	HashSet<Integer>  uniqueElements = new HashSet<>();
    	int index = 0;

    	for(int i=0; i<nums.length;i++) {
    		if(!uniqueElements.contains(nums[i])) {
    			uniqueElements.add(nums[i]);
    			nums[index]= nums[i];
    			index++;
    		}
    	}
     
    	return index;
    }
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,2,1,3,3,4,5};
		
		
		int newLength = removeDuplicates(a);
		
		for(int i=0; i<newLength ; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
