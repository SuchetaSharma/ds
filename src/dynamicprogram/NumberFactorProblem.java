package dynamicprogram;

public class NumberFactorProblem {
	//given number n, fine number of ways it is written as combination of 1,3,4
	public static void main(String[] args) {
		int numFactor = findNumberFactor(50);
		System.out.println(numFactor);

	}

	private static int findNumberFactor(int n) {
		if(n == 0 || n == 1 || n == 2 ) {
			return 1;
		}
		if(n == 3 ) {
			return 2;
		}
		int sub1 = findNumberFactor(n-1);	
		int sub2 = findNumberFactor(n-3);	
		int sub3 = findNumberFactor(n-4);	
		System.out.println("ssss");

		return sub1 + sub2 + sub3;
	}

}
