package StringsandArraysCC;

public class PallindromePermutaion {

	public static void main(String[] args) {
		
		//Given a string, write a function to check if it is a permutation of a palindrome. 
		//A palindrome is a word or phrase that is the same forwards and backwards. 
		//A permutation is a rearrangement of letters.
		
		boolean blnFlag = findPallindromePermutaion("taccattt");
	System.out.println(blnFlag);

	}
private static boolean findPallindromePermutaion(String str) {

	
	int[] arr = new int[128];
	int count = 0;
	for(int i=0; i<str.length(); i++) {
		int c = (int)str.charAt(i);
		if(c != -1) {
		arr[c]++;
		}
	}
	//if length of string is even, then all the characters must have even counts
	for(int i = 0; i<arr.length; i++) {
		if(str.length()%2 != 0) {
			if(arr[i] %2 != 0) {
				count ++;
			}
			if(count > 1) {
				return false;
			}
		}
		//if length of string is odd, then there can be odd count for one character
		if(str.length()%2 == 0) {
			if(arr[i] %2 != 0) {
				return false;
			}
		}
	}
	return true;
}
}
