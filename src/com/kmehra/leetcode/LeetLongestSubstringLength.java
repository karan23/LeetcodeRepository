package com.kmehra.leetcode;

import java.util.LinkedHashSet;

public class LeetLongestSubstringLength {

// SWP
// Write a function called findLongestSubstring, which accepts 
// a string and returns the length of the longest substring with
// all distinct characters. 	
// 
// https://leetcode.com/problems/longest-substring-without-repeating-characters	
public static int findLongestSubstring(String str) {
		
		int maxSize = 0;
		int start = 0;
		int end = 0;
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		
		char[] charray = str.toCharArray();
		
		while(start < charray.length) {
		
			if(end < charray.length
					&& !charSet.contains(charray[end])) {
				
				
				charSet.add(charray[end]);
				maxSize = Math.max(maxSize, charSet.size());
				end++;
			} else {
				
				charSet.remove(charray[start]);
				start++;
				
			} 
			
		}
		
		return maxSize;
		
	}
	
	public static void main(String[] args) {
		
		String str = "ritmschool";//"";//"bbbbbbbbb"; //"thecatinthehat"; //"thisisawesome";
		int longestSize = findLongestSubstring(str);
		System.out.println("The longest subarray size is : " + longestSize);
	}
}
