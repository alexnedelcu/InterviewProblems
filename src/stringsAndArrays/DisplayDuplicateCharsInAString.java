package stringsAndArrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class DisplayDuplicateCharsInAString {
	public static void main (String argv[]) {
		String s = new String("Hello");
		
		printDupCharsInAString(s.toCharArray());
	}
	
	
	public static void printDupCharsInAString(char [] string) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<string.length; i++) {
			if (map.containsKey((int)string[i])) {
				map.put((int)string[i], map.get((int)string[i])+1);
				if (map.get((int)string[i])==2)
					System.out.println("Duplicate letter "+string[i]);
			}
			else
				map.put((int)string[i], 1);
		}
		PriorityQueue<String> q = new PriorityQueue<String>();
		
	}
}
