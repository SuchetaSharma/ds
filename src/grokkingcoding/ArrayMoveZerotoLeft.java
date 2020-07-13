package grokkingcoding;

import java.util.Arrays;

public class ArrayMoveZerotoLeft {

	public static void main(String[] args) {

		// Given an integer array, move all elements //that are equal to 0 to the
		// left while maintaining the order of other elements in the array.

		// when array has only positive numbers
		int[] arr = { 1, 3, 0, 2, 4, 0, 5 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// when array has negative numbers as well
		int[] arr1 = { -1, -3, 0, 2, 4, 0, 5 };
		System.out.println("Original Array: " + Arrays.toString(arr1));
		int[] zeroarr = new int[arr1.length];
		int[] negativearr = new int[arr1.length];
		int zerocount = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				addtoNegArr(arr1[i], negativearr);
			} else if (arr[i] == 0) {

				zerocount ++;
			}

			else {
				for (int j = i + 1; j < arr1.length; j++) {
					if (arr1[i] > arr1[j]) {
						temp = arr1[i];
						arr1[i] = arr1[j];
						arr1[j] = temp;
					}
				}
			}
		}
		sortArr(negativearr);
		aggregateArrays(arr, zerocount, negativearr);

		int[] v = new int[] { 1, -10, 20, 0, -59, 63, 0, 88, 0 };

		moveZerosToLeft(v);

		// System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));

	}

	static void moveZerosToLeft(int[] A) {
		if (A.length < 1) {
			return;
		}

		int writeIndex = A.length - 1;
		int readIndex = A.length - 1;

		while (readIndex >= 0) {
			if (A[readIndex] != 0) {
				A[writeIndex] = A[readIndex];
				writeIndex--;
			}

			readIndex--;
		}

		while (writeIndex >= 0) {
			A[writeIndex] = 0;
			writeIndex--;
		}
	}

	private static void sortArr(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	private static void aggregateArrays(int[] arr, int zerocount, int[] negativearr) {
		int[] result = new int[zerocount + arr.length + negativearr.length];
		for(int i = 0; i< zerocount; i++) {
			result[i] = 0;
		}
		int counter = 0;
		int len = result.length;
		while(counter < negativearr.length) {
			result[len] = negativearr[counter];
			counter ++;
			len ++; 
			
		}
		counter = 0;
		len = result.length;
		while(counter < arr.length) {
			result[len] = arr[counter];
			counter ++;
			len ++; 
			
		}
		System.out.println("Changed Array: " + Arrays.toString(result));

	}


	private static void addtoNegArr(int ii, int[] arr) {
		if (arr == null || arr.length == 0) {
			arr[0] = ii;
		}

		arr[arr.length - 1] = ii;
	}
}
