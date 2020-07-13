 package elevenessential;

import java.util.HashMap;

public class MostFrequentlyOccurenceInanArray {
	//assumption is only 1 unique item is present in the array which most frequently occurs
	public static void main(String[] args) {
		int[] array1 = {1,3,1,1,1,3,2};
		int[] array2 = {};
		int[] array3 = {0};
		int[] array4 = {1,0,-1,-1,-1,-1,1};
		System.out.println(mostFrequent(array1));
		System.out.println(mostFrequent(array2));
		System.out.println(mostFrequent(array3));
		System.out.println(mostFrequent(array4));
		
		
	}

	private static int mostFrequent(int[] array) {
		int maxItem = -1;
		int maxCount = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : array) {
			if(map.containsKey(i)) {
				int newVal = map.get(i) + 1;
				map.put(i, newVal);
			}else {
				map.put(i, 1);
			}
			if(map.get(i) > maxCount) {
				maxCount = map.get(i);
				maxItem = i;
			}
		}
		return maxItem;
	}

}
