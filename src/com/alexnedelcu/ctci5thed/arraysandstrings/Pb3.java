package com.alexnedelcu.ctci5thed.arraysandstrings;
/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * @author Alex
 *
 */
public class Pb3 {
	public static void main (String argv[]) {
		char [] input1 = "hello!".toCharArray();
		char [] input2 = reverse("hello!".toCharArray());
		
		int [] countsCharsInput1 = new int[256];
		int [] countsCharsInput2 = new int[256];
		
		countCharacters(input1, countsCharsInput1);
		countCharacters(input2, countsCharsInput2);
		
		if (countersEqual(countsCharsInput1, countsCharsInput2))
			System.out.println("The char sequences are permutations");
		else System.out.println("The char sequences are not permutations.");
		
	}
	
	public static void countCharacters(char [] input, int [] counter) {
		// resetting the counter
		for (int i=0; i<counter.length; i++) 
			counter[i] = 0;
		
		// counting the chars in the input
		for (int i=0; i<input.length; i++)
			counter[i] ++;
		
	}
	
	public static boolean countersEqual(int [] counter1, int [] counter2) {
		for  (int i=0; i<counter1.length; i++) {
			if (counter1[i] != counter2[i]) return false;
		}
		return true;
	}
	
	/**
	 * Time complexity O(n)
	 * Space complexity O(n)
	 * 
	 * @param input
	 * @return
	 */
	public static char [] reverse (char[] input) {
		char [] newString = new char  [input.length];
		
		int stringLength = input.length;
		for (int i=0; i<stringLength; i++) {
			newString [newString.length-1-i] = input[i];
		}
		
		return newString;
	}
	
	
}
