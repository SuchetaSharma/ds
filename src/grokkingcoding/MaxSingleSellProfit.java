package grokkingcoding;

public class MaxSingleSellProfit {
	/*
	 * Given a list of daily stock prices (integers for simplicity), 
	 * return the buy and sell prices for making the maximum profit. 
	 */
	public static void main(String[] args) {
		// use kadane's algorithm
		 int[] array = {1, 2, 3, 4, 3, 2, 1, 2, 5};
	        Tuple result = null;
	        result = StockPrices.findBuySellStockPrices(array);
	        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result.x, result.y));

	        int[] array2 = {8, 6, 5, 4, 3, 2, 1};
	        result = StockPrices.findBuySellStockPrices(array2);
	        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result.x, result.y));

	}

}
