package dynamicprogram;

public class RecursiveMultiply {

	public int minProduct(int i, int j) {
		// TODO Auto-generated method stub
		int smaller = (i>j)? j: i;
		int bigger = (i>j)? i: j;
		int[] memo = new int[smaller + 1];
		int count = 0;
		int product = minProductHeleranother(smaller, bigger);
		return product;
	}

	public int minProductHeler(int bigger, int smaller, int count) {
		/*
		 * if(smaller == 0) return 0; if(smaller == 1) { return 1; }else
		 * if(memo[smaller] > 0){ return memo[smaller]; } int s = smaller >> 1; //Divide
		 * by 2 int side1 = minProduct(s, bigger,memo); int side2 = side1; if(smaller%2
		 * == 1) { side2 = minProduct(smaller -s, bigger, memo); } //cache memo[smaller]
		 * = side1 + side2; return memo[smaller];
		 * 
		 */
		 // iteratively calculate  
        // smaller times sum of bigger
		if(smaller == 0) {
			return count;
		}
		if(smaller != 0) {
			count+= (bigger + minProductHeler(bigger, smaller - 1, count));
		}
			return count;
		
		
	}
	//minProduct(31, 35) = 2 * minProduct(15, 35) + 35
	public int minProductHeleranother(int smaller, int bigger) {
		
		if(smaller == 0 ) return 0;
		if(smaller == 1) return 1;
		int s = smaller>>1; //divide by 2
		int halfProd = minProductHeleranother(s, bigger);
		if(s%2 == 0) {
			return halfProd + halfProd;
		}else {
			return halfProd + halfProd + bigger;
		}
		
	}

}
