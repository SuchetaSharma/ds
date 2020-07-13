package dynamicprogram;

public class MagicIndex {

	public static void main(String[] args) {
		/*
		 * A magic index in an array A[ 1.•.n-1] is defined to be an index such that
		 * A[i]=i. Given a sorted array of distinct integers, write a method to find a
		 * magic index, if one exists, in array A.
		 */
		// followup - What if the values are not distinct

		int[] arr = { 0, 1, 2, 3, 4, 9, 19 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				System.out.println(i);
			}
		}
		// if array is sorted, use binary search. This will fail if array does not have
		// distinct elements.

	}

	int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
	};

	int magicFast(int[] array, int start, int end) {
		if (end< start) return -1;
		int midindex =(start+ end)/ 2;
		int midValue = array[midindex];
		if (midValue ==midindex) {
		/* Search left */
		int leftindex = Math.min(midindex - 1, midValue);
		int left =magicFast(array, start, leftindex);
		if (left>= 0) {
		return left;
		
		//Search right 
		int rightindex = Math.max(midindex + 1, midValue);
		int right = magicFast(array, rightindex, end);
		return right;
		}
		
		
		}

}
}
