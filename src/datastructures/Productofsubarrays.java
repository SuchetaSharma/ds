package datastructures;

public class Productofsubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int productValue = 1;
		int[] arr = new int[3];
		
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		for (int i=0;i<arr.length;i++) {
			productValue = productValue*arr[i];
		}
		System.out.println("product1"+productValue);
		for (int i=0;i<arr.length;i++) {
			productValue = productValue*arr[i];
			for (int j=i+1;j<arr.length ;j++) {
				productValue = productValue*arr[j] * arr[i];
			}
		}
		System.out.println("productValue" + productValue);
	}

}
