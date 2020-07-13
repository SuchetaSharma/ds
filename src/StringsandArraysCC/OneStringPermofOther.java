package StringsandArraysCC;

import java.util.ArrayList;
import java.util.Arrays;

public class OneStringPermofOther {

	public static void main(String[] args) {
		//check if one string is permutation of other. Assumption is that comparision is case sensitive and whitespace is insignificant
		//boolean blnFlag = checkperm("sucheta","sucheta");
		boolean blnFlagAnother = checkpermanother("sucheta","sucheta");
		System.out.println(blnFlagAnother);
	}
private static boolean checkperm(String str1, String str2) {
	if(str1 == null || str2 == null) {
		return false;
	}
	if (str1.length() != str2.length()) {
	return false;
	}
	return sort(str1).equals(sort(str2));
		/*
		 * ArrayList arr = new ArrayList(); for (int i=0; i< str1.length(); i++) {
		 * arr.add(str1.charAt(i)); } for (int i=0; i< str2.length(); i++) {
		 * if(arr.contains(str2.charAt(i))) { continue; }else { return false; } return
		 * true;
		 */
}
private static String sort(String s) {
	char[] c = s.toCharArray();
	java.util.Arrays.sort(c);
	return new String(c);
}
private static boolean checkpermanother(String str1, String str2) {
	
		  int[] arr = new int[128];
		  for (char c: str1.toCharArray()) {
		  arr[c]++;
		  } 
		  for (int i=0; i< str2.length(); i++) {
		  int ci = (int) str2.charAt(i); 
		  arr[ci] --;
		  if(arr[ci] < 0) {
			  return false;
		  }
		  }
		  for (int i=0; i< arr.length; i++) {
			  if(arr[i]>0)
			  return false;
		  }
		  return true;
		 
}
}
