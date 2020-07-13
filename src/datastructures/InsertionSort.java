package datastructures;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] SortedArr = new int[5];

		int temp = 0;

		arr[0] = 10;
		arr[1] = 70;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 90;
		System.out.println("before sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			SortedArr[i] = arr[i];

			for (int j = 0; j < i; j++) {

				if (SortedArr[j] > SortedArr[j + 1]) {
					temp = SortedArr[j + 1];
					SortedArr[j + 1] = SortedArr[j];
					SortedArr[j] = temp;

				}
			}

		}

		System.out.println("after sort");

		for (int i = 0; i < SortedArr.length; i++) {
			System.out.println(SortedArr[i]);
		}

	}

}
