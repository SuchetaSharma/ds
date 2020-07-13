package StringsandArraysCC;

import java.util.ArrayList;

public class UniquecharactersinString {
//ask if the string is an ascii string(256 characters) or a unicode string
	public static void main(String[] args) {
		//identify if a string has all unique characters

		boolean blnFlag = identifyUniqueCharacters("Ss111ucheta");
		System.out.println(blnFlag);
		//boolean blnFlagDS = identifyUniqueCharactersDS("Ssucheta");
		//System.out.println(blnFlagDS);
	}
	
	private static boolean identifyUniqueCharacters(String str) {
		ArrayList list = new ArrayList();
		if(str.length() > 128) return false;
		for (char c: str.toCharArray()) {
			
			if(list.contains(c)) {
				return false;
			}else {
				System.out.println("in else" + c);
				list.add(c);
			}
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		return true;
	}
private static boolean identifyUniqueCharactersDS(String str) {
	for (int i = 0; i< str.length();i++) {
		for (int j = i+1; j< str.length() - 1;j++) {
			if (str.charAt(i) == str.charAt(j)) {
				return false;
			}
		}
	}
	return true;
}
}
