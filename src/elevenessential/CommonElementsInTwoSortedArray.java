package elevenessential;

import java.util.ArrayList;

public class CommonElementsInTwoSortedArray {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,3,4};
		int[] array2 = {1,3,5,6,7,7};
		ArrayList arr = commonElementsinArray(array1, array2);
		for(int i=0;i<arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
		
	}
	 // Need to use ArrayList because we don't know the size of the resulting
    // array yet. Note that an ArrayList is resizable
	private static ArrayList commonElementsinArray(int[] array1, int[] array2) {
		ArrayList arr = new ArrayList();
		int p1 = 0;
		int p2 = 0;
		while (p1 < array1.length && p2 < array2.length) {
			if(array1[p1] == array2[p2]) {
				arr.add(array2[p2]);
				p1 +=1;
				p2 +=1;
			}else if(array1[p1] > array2[p2]) {
				p2 +=1;
				
			}else {
				p1 +=1;
			}
		}
		
		
		return arr;
	}

}
