package com.saksham.interviewProblems;
import java.util.Stack;

	public class ValidParentheses {
	    public boolean isValid(String s) {
	        Stack<Character> st = new Stack<>(); // Stack in Java uses the wrapper class Character
	        int sizeOfs = s.length();
	        
	        for (char c : s.toCharArray()) { // Convert string to char array to iterate
	            if (c == '{' || c == '[' || c == '(') {
	                st.push(c);
	            } else {
	                if (!st.empty() && ((c == ')' && st.peek() == '(') ||
	                                    (c == '}' && st.peek() == '{') ||
	                                    (c == ']' && st.peek() == '['))) {
	                    st.pop();
	                } else {
	                    return false;
	                }
	            }
	        }
	        return st.empty(); // The stack should be empty if all parentheses are valid and balanced
	    }

	    public static void main(String[] args) {
	    	ValidParentheses solution = new ValidParentheses();
	        
	        // Test cases
	        String test1 = "()[]{}";
	        String test2 = "([)]";
	        String test3 = "{[]}";

	        // Print results
	        System.out.println(solution.isValid(test1)); // Expected output: true
	        System.out.println(solution.isValid(test2)); // Expected output: false
	        System.out.println(solution.isValid(test3)); // Expected output: true
	    }
	}
