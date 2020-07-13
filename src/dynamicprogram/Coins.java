package dynamicprogram;

import java.util.HashMap;

public class Coins {

	public static void main(String[] args) {
		/*
		 * Given an infinite number of quarters (25 cents), dimes (1O cents), nickels (5 cents), and pennies (1 cent),
		 * write code to calculate the number of ways of representing n cents.
		 * 
		 */
	int makeChange = makeChange(100);

	}

	private static int makeChange(int amount) {
		int[] demos = {25,10,5,1};
		HashMap[][] map = new HashMap[amount+1][demos.length];
		return makeChange(amount, demos, 0, map);
	}

	private static int makeChange(int amount, int[] demos, int i, HashMap[][] map) {
		if(i >= demos.length - 1) {
			return 1; //one demo remaining
		}
		if(null != map[amount][i] ) {
			return map[amount][i] ;
		}
		int demAmount = demos[i];
		int ways = 0;
		for(int j = 0; j*demAmount < amount; j++) {
			ways += makeChange(amount - i*demAmount, demos, i+1, map);
		}
		map[amount][i] = ways;
		return ways;
	}

}
