package stringsAndArrays;

import java.util.HashMap;

public class CCI_P1_UniqueCharacters {
	public static void main (String [] args) {
		String input = "Hello world!";
		//input =  "abcde";
		
		if (checkForUniqueCharsWithHashMap(input))
			System.out.println("All the characters are unique");
		else
			System.out.println("There are characters that repeat");
	}
	
	// time perfornamce n^2
	public static boolean checkForUniqueChars(String s) {
		for (int i=0;  i< s.length(); i++) {
			for  (int j=i+1; j<s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) 
					return false;
			}
		}
		return true;
	}
	
	//time performance n
	public static boolean checkForUniqueCharsWithHashMap(String s) { 
		HashMap <Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		
		if (s.length() > 256) return false;
		
		for (Integer i=0; i<256; i++)
			hm.put(i, false);
		
		for(int i=0; i<s.length(); i++) {
			if (hm.get((int)s.charAt(i)) == false)
				hm.put((int)s.charAt(i), true);
			else
				return false;
		}
		
		return true;
		
	}
}
