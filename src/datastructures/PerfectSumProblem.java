package datastructures;

public class PerfectSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumValue = 0;
		int[] arr = new int[4];
		int k =6;
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 3;
	
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length ;j++) {
				if((arr[i] + arr[j]) == k) {
					System.out.println("subset is"+"("+ arr[i] + ")" + arr[j]);
				}
			}
		}
		
	}

}
