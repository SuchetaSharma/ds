package StringsandArraysCC;

public class ZeroMatrix {

	public static void main(String[] args) {
		//if any element is 0, its entire row and column are set to 0.
		
		int[][] arr = {
				{1,2,3},
				{4,0,6},
				{7,8,9},
		};
		
		
		arr = calculateZeroMatrix(arr);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	private static int[][] calculateZeroMatrix(int[][] arr) {
		boolean[] row = new boolean[arr.length];
		boolean[] column = new boolean[arr[0].length];
		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {
			if(arr[i][j] == 0) {
				row[i] = true;
				column[j] = true;
				
			}
		}
		}
		
		for(int rowLen=0; rowLen<row.length; rowLen++) {
			if(row[rowLen]) nullifyRow(arr, rowLen);
		}
		for(int colLen=0; colLen<column.length; colLen++) {
			if(column[colLen]) nullifyColumn(arr,colLen);
		}
		return arr;
	}
	private static void nullifyColumn(int[][] arr, int colLen) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			arr[i][colLen] = 0;
		}
		
	}

	private static void nullifyRow(int[][] arr, int rowLen) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			arr[rowLen][i] = 0;
		}
	}

	

}
