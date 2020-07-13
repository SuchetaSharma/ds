package dynamicprogram;

import java.util.Arrays;

public class TripleStep {
	
	/*
	 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. 
	 * Implement a method to count how many possible ways the child can run up the stairs.
	 */
	public static void main(String[] args) {
		int n = 10;
		int[] count1 = new int[n+1];
		Arrays.fill(count1, -1);
		int ways1 = countPossibleWays(3, count1);
		System.out.println(ways1);
		
	}

	private static int countPossibleWays(int n, int[] count1) {
		
		if(n <=0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		else if(count1[n] > -1){
			return count1[n];
		}else {
			count1[n] = countPossibleWays(n-1, count1) + countPossibleWays(n-2, count1) + countPossibleWays(n-3, count1);
			return count1[n];
		}
		
		
	}

}
