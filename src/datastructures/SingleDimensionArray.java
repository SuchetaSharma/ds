package datastructures;

public class SingleDimensionArray {

	SingleDimensionArray() {

	}

	// traverse
	void traverseArray(int[][] arr) {
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println(arr[i][j]);
				}

			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index not found");
		}
	}

	// insert
	void insertIntoArray(int[][] arr, int num, int row, int col) {
		if (arr != null) {
			System.out.println("in insert" + arr[row][col]);
			if (arr[row][col] != Integer.MIN_VALUE) {
				arr[row][col] = num;
			}
		}
	}

	// accessarray
	void accessArrayCell(int[][] arr, int row, int col) {
		try {
			System.out.println(arr[row][col]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index not found");
		}
	}

	// search in an array
	void searchArray(int[][] arr, int num) {
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == num) {
						System.out.println("number foundss" + arr[i][j]);

						return;
					}
				}
				System.out.println("item not found");
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index not found");
		}
	}

	// deletevaluefromarray
	void deleteArray(int[][] arr, int num) {
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == num) {
						System.out.println("number found" + arr[i][j]);
						arr[i][j] = Integer.MIN_VALUE;
					}
				}

			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index not found");
		}
	}
}
