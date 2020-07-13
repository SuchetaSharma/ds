package datastructures;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 40;
		arr[2] = 10;
		arr[3] = 5;
		arr[4] = 50;
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				}
			}
		}
		System.out.println("after sort");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
