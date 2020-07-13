package grokkingcoding;

public class PowerofN {

	public static void main(String[] args) {
		// Given a double, 'x', and an integer, 'n', write a function to calculate 'x' raised to the power 'n'.
		 int base = 2, exponent = 5;

	        long result = 1;

	        while (exponent != 0)
	        {
	            result *= base;
	            --exponent;
	        }

	        System.out.println("Answer = " + result);

	}

}
