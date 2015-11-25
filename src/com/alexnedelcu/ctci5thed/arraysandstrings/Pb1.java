package com.alexnedelcu.ctci5thed.arraysandstrings;
/**
 *  Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures? 
 *  
 *  Solution:
 *  Uses a (modified) quick sort algorithms to find the duplicate chars
 *  If a duplicate is found before the string is sorted, then sorting is
 *  aborted and the function returns false (no unique chars) 
 *  
 * @author Alex
 *
 */
class Pb1 {

	public static void main (String [] args) {
		char [] string = "hello!".toCharArray();
		
		if (containsUniqueCharacters(string))
			System.out.println("The string only contains unique characters");
		else
			System.out.println("The string contains duplicate characters");
		
	}
	
	
	/**
	 * This function is uses a modified quicksort approach.
	 * It attempts to sort the string, but, if, at any point,
	 * the pivot seems to have a duplicate in a certain partition,
	 * then it returns false (duplicate characters)
	 * 
	 * Time complexity O(nlog(n))
	 * 
	 * @param input
	 * @return
	 */
	static boolean containsUniqueCharacters (char [] input) {
		return containsUniqueCharacters(input, 0, input.length-1);
	}
	
	static boolean containsUniqueCharacters(char[] input, int startPos, int endPos){
		
		if (endPos-startPos<1) return true;
		
		// choose pivot
		char pivot =  input[startPos];
		
		// rearrange the array so that the pivot is on the right position
		int pivotPos = rearrange(input, pivot, startPos, endPos);
		if (pivotPos == -1) return false; 
		
		return containsUniqueCharacters(input, startPos, Math.max(pivotPos-1, startPos)) &&
				containsUniqueCharacters(input, Math.min(pivotPos+1, endPos), endPos);
		
	}
	
	
	static int rearrange(char [] input, char pivot, int startPos, int endPos) {
		int pivotPos = startPos;
		for (int i=startPos; i<=endPos; i++) {
			if (input[i]<pivot) {
				char tmpNumSmallerThanPivot = input[i];
				char tmpNumToBeMovedFuther = input[pivotPos+1];
				input[pivotPos+1] = pivot;
				input[pivotPos] = tmpNumSmallerThanPivot;
				input[i] = tmpNumToBeMovedFuther;
				pivotPos++;
			} else if (input[i]==pivot && i!=pivotPos) return -1; // return -1 if the pivot has a duplicate in the string
		}
		return pivotPos;
	}

}