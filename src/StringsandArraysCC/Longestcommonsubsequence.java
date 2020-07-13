package StringsandArraysCC;

import java.util.Arrays;

public class Longestcommonsubsequence {

	public static void main(String[] args) {
		// S1 = 'elephant', s2 = 'eretpat', lcs - 'eepat'
		Integer[][] dp = new Integer[10][10];
	
		Integer value = findLCS(dp, "elephant", "eretpat", 0, 0);
		System.out.println(value);

	}

	private static Integer findLCS(Integer[][] dp, String s1, String s2, int i1, int i2) {

		
		if(i1 == s1.length() || i2 == s2.length()) {
			return 0;
		}
		if (dp[i1][i2] == null) {//if we have not already solved this problem, only then solve it
			if (s1.charAt(i1) == s2.charAt(i2)) {
				dp[i1][i2] = 1 + findLCS(dp, s1, s2, i1 + 1, i2 + 1); //If current character in both the string matches, then increase the index by 1 in both the strings.
				return dp[i1][i2];
			}else {
				int c1 = findLCS(dp, s1, s2, i1, i2 + 1);//Increase index of 2nd String
				int c2 = findLCS(dp, s1, s2, i1 + 1, i2);//Increase index of 1st String
				dp[i1][i2] = Math.max(c1, c2);
			}
		}
		return dp[i1][i2];	
		}
	
		
	
}
