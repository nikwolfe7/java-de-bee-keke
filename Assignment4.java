/**
 * Assignment 4: Using the code you wrote in Assignment #3, 
 * submit your solution through the LeetCode Online Judge 
 * linked below and verify that it's correct. 
 *
 * Below is a copy of the Solution class that can be cut + pasted 
 * into the LeetCode online judge. 
 */
public class Solution {
	public String reverseString(String str) {
	char[] charArray = new char[str.length()];
	int i, j;
	for(i = str.length()-1, j = 0; i >= 0; --i, ++j) {
		charArray[j] = str.charAt(i);
	}	
	return new String(charArray);
	}

}
