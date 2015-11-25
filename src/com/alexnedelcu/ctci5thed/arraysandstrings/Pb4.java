package com.alexnedelcu.ctci5thed.arraysandstrings;
class Pb4 {
	public static void main (String argv[] ) {
		char [] input = new char [50];
		int spaces = 0;
		
		input[0] = 'H';
		input[1] = 'i';
		input[2] = ' ';
		input[3] = 't';
		input[4] = 'h';
		input[5] = 'e';
		input[6] = 'r';
		input[7] = 'e';
		input[8] = ' ';
		input[9] = '!';
		input[10] = '!';
		
		int stringLength = 11;
		
		
		
		
		// count the number of spaces needed to replace
		for (int i=0; i<input.length; i++) {
			if (input[i] == ' ')
				spaces ++;
		}
		
		// form the new string
		// the position of a character will be given by the formuls:
		// newPos = newPos + numSpacesToReplaceToTheLeft * (3-1)
		int spacesLeftToReplace = spaces, spacesReplaced=0;
		for (int i=stringLength+spaces*2; i>=0; i--) {
			if (input[i-spacesLeftToReplace*2] == ' ') {
				input[i]='0';
				input[i-1]='2';
				input[i-2]='%';
				i=i-3;
				spacesReplaced++;
				spacesLeftToReplace--;
			}
			input [i] = input[i-spacesLeftToReplace*2];
		}
		
		//print the string
		for (int i=0; i<stringLength + spaces*2; i++) {
			System.out.print (input[i]);
		}
	}

}
