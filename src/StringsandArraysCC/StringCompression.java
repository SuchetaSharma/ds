package StringsandArraysCC;

public class StringCompression {

	public static void main(String[] args) {
		//string aabcccccaaa would become a2blc5a3
		StringBuilder compressedString = getCompressedString("ssssstttdddddbbbbgggg");
		System.out.println(compressedString);

	}
private static StringBuilder getCompressedString(String str) {
	
	int countCons = 0;
	StringBuilder compressedString = new StringBuilder();
	for (int i=0; i < str.length(); i++) {
		
		//System.out.println(str.charAt(i));
		countCons++;
		if (i+1>= str.length()|| str.charAt(i) != str.charAt(i+1)) {
			compressedString.append(str.charAt(i));
			compressedString.append(countCons);
			countCons = 0;	
			
		}
		//System.out.println(compressedString);
	}
	return compressedString;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
