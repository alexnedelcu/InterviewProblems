package com.alexnedelcu.ctci5thed.arraysandstrings;

import java.util.LinkedList;

public class Pb5 {
	public static void main (String [] args) {
		
		char [] test=transform("helloooo".toCharArray());
		
		for  (int i=0; i<test.length; i++) 
			System.out.print(test[i]);
	}
	
	private static char[] transform(char [] input) {
		
		LinkedList<Integer> groupCounts = new LinkedList<Integer>();
		LinkedList<Character> groupChars = new LinkedList<Character>();

		// count the unique char groups
		groupCounts.addFirst(0); 
		groupChars.addFirst(input[0]); 
		int counter = 0;
		for (int i=1; i<input.length; i++) {
			if (input[i] != input[i-1]) {
				groupCounts.addFirst(1);
				groupChars.addFirst (input[i]);
			} else {
				groupCounts.set(0, groupCounts.getFirst()+1);
			}
		}
		
		// reconstruct the character sequence
		char  [] seq = new char [groupCounts.size()*2];
		for (int i=groupCounts.size()*2-1; i>=0; i--) {
			seq [i] = groupCounts.removeFirst().toString().charAt(0);
			seq [--i] = groupChars.removeFirst();
		}
		
		return seq;
	}
}
