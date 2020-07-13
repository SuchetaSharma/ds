package dynamicprogram;

public class ZeroOneeKnapSack {

	//given n items, each item has weight and profit
	//put this items in a knapsack which has capacity <= 'C'
	//restriction  is that only 1 quantity of each item can be placed in the knapsack
	// find max profits from the items
	public static void main(String[] args) {
		ZeroOneKnapsack_TopDown ks = new ZeroOneKnapsack_TopDown();
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		int maxProfit = ks.knapsack(profits, weights, 7);
		System.out.println(maxProfit);
	}

}
