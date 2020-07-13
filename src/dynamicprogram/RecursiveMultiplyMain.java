package dynamicprogram;

public class RecursiveMultiplyMain {
	
	//o(logs) - s is smaller number
	public static void main(String[] args) {
		/*
		 * Alternatively, we could count half the squares.
		 * and then double it (by adding this count to itself). To count half the squares, we repeat the same process.
		 */
		RecursiveMultiply recursiveMultiply = new RecursiveMultiply();
		int product = recursiveMultiply.minProduct(4,5);
		System.out.println(product);

	}

	
}
