package dynamicprogramming;

public class LongestIncreasingSequence {
	public static void main (String argv[]) {
		int [] array = {0,3,5,7,1,2,3, 4};
		int [] result = longestIncreasingSequence(array, array.length-1);
		
		System.out.println("Longest Sequence: ");
		for (int i=0;i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] longestIncreasingSequence (int [] array, int position) {
		if (position == 0) {
			int [] r = {array[0]};
			return r;
		} else {
			int [] previousLongestSequence = longestIncreasingSequence(array, position-1), r=previousLongestSequence;
			if (array[position] > previousLongestSequence[previousLongestSequence.length-1]) {
				r = new int[previousLongestSequence.length+1];
				for (int i=0; i<previousLongestSequence.length; i++)
					r[i]=array[i];
				r[position] = array[position];
			}
			return r;
		}
			
	}
}
