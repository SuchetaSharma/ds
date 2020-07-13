package datastructures;

import datastructures.SingleDimensionArray;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		
		System.out.println("yippeei");
		SingleDimensionArray singleeDimArray = new SingleDimensionArray();
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		singleeDimArray.traverseArray(arr);
		singleeDimArray.insertIntoArray(arr, 77, 0, 1);
		singleeDimArray.deleteArray(arr, 1);
		singleeDimArray.traverseArray(arr);
		singleeDimArray.accessArrayCell(arr, 1, 2);
		singleeDimArray.searchArray(arr, 77);

	}

}
