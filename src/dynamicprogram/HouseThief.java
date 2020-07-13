package dynamicprogram;

public class HouseThief {
	
	

	public int calculateCost(int[] arr, int currentIndex, int[] memo) {
		if(arr.length == 0) return 0;
		if (arr.length == 1) return arr[0];
		
if(memo[currentIndex] == 0) {
	int stealCurrent = arr[currentIndex] + calculateCost(arr, currentIndex+2, memo);
	int skipCurrent = calculateCost(arr, currentIndex+1, memo);
	memo[currentIndex] = Math.max(stealCurrent, skipCurrent);
}
return memo[currentIndex];

	}

}
