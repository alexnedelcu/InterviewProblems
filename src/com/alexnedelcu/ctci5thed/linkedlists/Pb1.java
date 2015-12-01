package com.alexnedelcu.ctci5thed.linkedlists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Write code to remove duplicates from an unsorted linked list
 * @author Alex
 *
 */
public class Pb1 {

	public static void main(String[] args) {
		LinkedList<Character> str = new LinkedList<Character>();
		
		str.add('h');
		str.add('e');
		str.add('l');
		str.add('l');
		str.add('o');
		str.add(' ');
		str.add('w');
		str.add('o');
		str.add('r');
		str.add('l');
		str.add('d');
		
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		
		Iterator<Character> iterator = str.iterator();
		
		while (iterator.hasNext()) {
			Character ch = iterator.next();
			if (charCounts.keySet().contains(ch) && charCounts.get(ch) == 1)
				iterator.remove();
			else {
				charCounts.put(ch, 1);
				System.out.print(ch);
			}
		}
		
		
	}

}
