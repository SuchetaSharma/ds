package dynamicprogram;

import java.util.ArrayList;
import java.util.Hashtable;

public class PermutationswithoutDuplicatesMain {
	//Write a method to compute all permutations of a string of unique characters.
	public static void main(String[] args) {
		//P(a1a2a3a4) = {a1+ P(a2a3a4)}+ {a2+ P(a1a,a4)} + {a, + P(a1a2a4)}+ {a4 + P(a1a2a,)}
		
		String str = "sucheta";
		ArrayList<String> list = getPermutations(str);
		for(String s: list) {
			System.out.println(s);
		}

	}

	private static ArrayList<String> getPermutations(String remainder) {
		int len = remainder.length();
		ArrayList<String> result = new ArrayList<String>();
		Hashtable<String, String> strTable = new Hashtable<String, String>();
		if(len == 0) {
			result.add("");
			return result;
		}
		for(int i=0; i< len; i++) {
			/* Remove char i and find permutations of remaining chars.*/
			String before = remainder.substring(0, i);
			String after = remainder.substring(i+1, len);
			ArrayList<String> partials = getPermutations(before + after);	
		
		/* Prepend char i to each permutation.*/
		for(String s: partials) {
			if(!strTable.contains(remainder.charAt(i) + s))
			result.add(remainder.charAt(i) + s);
			strTable.put(remainder.charAt(i) + s, remainder.charAt(i) + s);
		}
		
		}
		return result;
		
		
	}

}
