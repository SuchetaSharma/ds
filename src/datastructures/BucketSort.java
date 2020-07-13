package datastructures;
import java.math.*;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

	public static void main(String[] args) {

		int[] arr = new int[5];

		int temp = 0;

		arr[0] = 10;
		arr[1] = 70;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 90;
		int maxValue = 0;
		int numBuckets = (int) Math.ceil(Math.sqrt(arr.length));
		ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
		//initializing empty buckets
				for(int i =0;i<buckets.length;i++) {
					buckets[i] = new ArrayList<Integer>();	 
				}
		
		int bucketIndex = 0;
		System.out.println("number of buckets"+numBuckets);


		for (int i = 0; i < arr.length -1 ; i++) {
			if(arr[i] > arr[i+1]) {
				maxValue = arr[i];
			}else {
				maxValue = arr[i+1];
			}
		}
		System.out.println("maxValue is "+ maxValue);
		for (int i = 0; i < arr.length; i++) {
			bucketIndex = (int) Math.ceil((arr[i]*numBuckets)/maxValue);
			System.out.println("bucketIndex" + bucketIndex);
			buckets[bucketIndex].add(arr[i]);
		}
		
		//Sort Buckets
				for(ArrayList<Integer> bucket: buckets) {
					Collections.sort(bucket);
				}
				
				for(int i=0; i<buckets.length; i++) {
					System.out.println("\nBucket#" + i + " :");
					for (int j=0; j<buckets[i].size(); j++) {
						System.out.print(buckets[i].get(j)+"  ");
					}
				}
				
				
		
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
		 * j++) {
		 * 
		 * if (arr[i] > arr[j]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */

		
	

	}

}
