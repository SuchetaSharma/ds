package StringsandArraysCC;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Sucheta";
		System.out.println(reverseString(str));
		reverseStringsecond(str);

	}
//we can use bytearray as well
	private static void reverseStringsecond(String str) {
		char[] charArr = str.toCharArray();
		StringBuilder strrev = new StringBuilder();
		for(int i=charArr.length - 1; i>=0;i--) {
			strrev.append(charArr[i]);
		}
		System.out.println( strrev);
		
	}

	public static String reverseString(String str) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		return strBuilder.reverse().toString();
		
	}

}
