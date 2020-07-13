package dynamicprogram;

//find minimum operations to convert one string to another
public class ConvertOneStringtoAnother {

	public static void main(String[] args) {
		String str1 = "Suchetaaaa";
		String str2 = "Sucheta";
		Integer[][] memo = new Integer[str1.length() + 1][str2.length()+1];
		System.out.println(convertOneStringtoAnother("Suchetaaaa", "Sucheta", memo, 0, 0));

	}
	//assume  str1 is longer than str2
	private static int convertOneStringtoAnother(String str1, String str2, Integer[][] memo, int i1, int i2) {
		
		if(memo[i1][i2] == null) {
			if(i1 == str1.length()) { // if we have reached the end of s1, then insert all the remaining characters of s2
				memo[i1][i2] = str2.length() - i2;
			}
			else if(i2 == str2.length()) { // if we have reached the end of s2, then insert all the remaining characters of s1
				memo[i1][i2] = str1.length() - i1;
			}
			else if(str1.charAt(i1) == str2.charAt(i2)) // If the strings have a matching character, recursively match for the remaining lengths.
		        memo[i1][i2] = convertOneStringtoAnother(str1, str2,memo, i1+1, i2+1);
		else {
			 int c1 = convertOneStringtoAnother(str1, str2,memo, i1+1, i2); //delete
		        int c2 = convertOneStringtoAnother(str1, str2,memo, i1, i2+1); //insert
		        int c3 = convertOneStringtoAnother(str1, str2,memo, i1+1, i2+1); //replace
		        memo[i1][i2] = 1 + Math.min(c1, Math.min(c2, c3));
		}
		}
		return memo[i1][i2];
	}

	
}
