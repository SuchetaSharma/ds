package dynamicprogram;

public class SubsetofaSet {
	//The total number of subsets of any given set is equal to 2^ (no. of elements in the set). 
	/*
	 * Starting from right, 1 at ith position shows that the ith element of the set is present as 0 shows.
	 * that the element is absent. Therefore, what we have to do is just generate the binary numbers from 0 to 2^n – 1. 
	 * where n is the length of the set or the numbers of elements in the set.
	 */
	/*
	 * Input: 
S = {a, b, c, d}
Output:
{}, {a} , {b}, {c}, {d}, {a,b}, {a,c},
{a,d}, {b,c}, {b,d}, {c,d}, {a,b,c}, 
{a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
0000	{}
0001	{a}
0010	{b}
0011	{a, b}
0100	{c}
0101	{a, c}
0110	{b, c}
0111	{a, b, c}
1000	{d}
1001	{a, d}
1010	{b, d}
1011	{a, b, d}
1100	{c, d}
1101	{a, c, d}
1110	{b, c, d}
1111	{a, b, c, d}
	 */
	public static void main(String[] args) {
		 char set[] = {'a', 'b', 'c'}; 
	        printSubsets(set); 

	}
	 // Print all subsets of given set[] 
    static void printSubsets(char set[]) 
    { 
        int n = set.length; 
  
        // Run a loop for printing all 2^n 
        // subsets one by one 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
                if ((i & (1 << j)) > 0) 
                    System.out.print(set[j] + " "); 
  
            System.out.println("}"); 
        } 
    } 
}
