package datastructures;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[5];

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
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		System.out.println("after sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
