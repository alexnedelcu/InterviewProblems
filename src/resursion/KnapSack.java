package resursion;

public class KnapSack {

	
	public static void main (String argv[]) {
		int [] weights = {1,2,3,4,5,6,7,8,9, 10};
		int sum = 10;
		
		KnapSack ks = new KnapSack();
		ks.knapsackv1(weights, sum, "");
	}
	
	
	/*
	 * This takes n! * n
	 */
	public boolean knapsackv1(int[] weights, int sum, String result) {
		
		for (int i=0; i<weights.length; i++) {
			if (sum == weights[i]) {
				System.out.println("Sum: "+result+"+"+weights[i]);
				return true;
			} else {
				knapsackv1(buildArrayExceptElement(weights, i), sum-weights[i], result + "+" + weights[i]);
				//if (knapsack(buildArrayExceptElement(weights, i), sum-weights[i], result + "+" + weights[i])) return true;
			}
		}
		return false;
	}
	
	private int[] buildArrayExceptElement(int [] arr, int pos) {
		int[] newArr = new int[arr.length-1];
		
		for (int i=0; i<arr.length; i++) {
			if (i<pos) newArr[i]=arr[i];
			else if (i>pos) newArr[i-1]=arr[i];
		}
		
		return newArr;
	}
	
	public boolean knapsackv2(int[] weights, int sum, String result) {
		
		
		
		return false;
	}
}
