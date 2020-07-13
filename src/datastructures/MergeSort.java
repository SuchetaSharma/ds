package datastructures;

public class MergeSort {
public static void mergeSort(int[] arr, int left, int right) {
	if(right > left) {
		int m = (right+left)/2;
		mergeSort(arr, left, m);
		mergeSort(arr, m+1, right);
		merge(arr, left, m , right);
	}
}
	private static void merge(int[] arr, int left, int m, int right) {
	int[] tempLeftArray = new int[m - left + 2];
	int[] tempRightArray = new int[right -m + 1];
	for(int i=left; i< m-left + 1;i++) {
		tempLeftArray[i] = arr[i];
	}
	
	for(int i=m; i< right - m - 1; i++) {
		tempRightArray[i] = arr[i];
	}
	int i = 0, j = 0;
	for (int k = left; k < right; k++) {
		if (tempLeftArray[i] < tempRightArray[j]) {
			arr[k] = tempLeftArray[i];
			i++;
		} else {
			arr[k] = tempRightArray[j];
			j++;
		}
	}
	
	for (int mi = 0; mi < arr.length; mi++) {
		System.out.print(arr[mi]+"  ");
	}
	
	
}//end of method
	

	public static void main(String[] args) {
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 70;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 90;
		mergeSort(arr, 0, 5);
}
}