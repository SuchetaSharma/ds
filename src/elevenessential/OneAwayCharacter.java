package elevenessential;

import java.util.ArrayList;

public class OneAwayCharacter {
//O(n) - n length of large string
	public static void main(String[] args) {
		// change character, delete, add
		String str = "abcde";
		String str1 = "abcdeee";
		boolean boolFlag = false;
		
		if (Math.abs(str.length() - str1.length()) >= 2) {
			System.out.println("in 1st loop");
			boolFlag = false;
		}
		
		else if (str.length() == str1.length()) {
			System.out.println("in equal loop");
			boolFlag = oneEditAway(str, str1);
		}else
		if (str.length() > str1.length()) {
			System.out.println("in str loop");
			boolFlag = oneEditDifferentLengthAway(str, str1);
		}
		else {
			System.out.println("in str1 loop");
			boolFlag = oneEditDifferentLengthAway(str1, str);
		}

		System.out.println("boolFlag"  + boolFlag);
	}
	
private static boolean oneEditDifferentLengthAway(String s1, String s2) {

int i = 0;
int countDiff = 0;
while (i < s2.length()) {
    if (s1.charAt(i + countDiff) == s2.charAt(i)) {
        i += 1;
    } else {
        countDiff += 1;
    }
    if (countDiff > 1) {
        return false;
    }
}
return true;
}

	//assume str.length = str1.length + 1, abcde, abde

	private static boolean oneEditDifferentLengthAway_old(String str, String str1) {
		
		char[] charArr = str.toCharArray();
		char[] charArr1 = str1.toCharArray();
		//list of non repeatable characters
		ArrayList arrList = new ArrayList();
		int mismatchcount = 0;
		for(int i=0; i<charArr.length; i++) {
			if(str1.indexOf(charArr[i]) >=0) {
				if(arrList.contains(charArr[i])) {
					mismatchcount = mismatchcount + 1;
				}else {
				
				arrList.add(charArr[i]);
			}
			}
			
			if(str1.indexOf(charArr[i]) < 0) {
				mismatchcount = mismatchcount + 1;
			}
			
		}
	if(mismatchcount > 1) {
		return false;
	}
			return true;
	}
	
	//same length
	private static boolean oneEditAway(String str, String str1) {
		
		char[] charArr = str.toCharArray();
		char[] charArr1 = str1.toCharArray();
		int mismatchcount = 0;

		
		// only change
				

					for (int i = 0; i < charArr.length; i++) {
						
							// if the string completes

							if ((charArr[i] != charArr1[i])) {
								System.out.println(charArr[i] + "" + charArr1[i]);
								mismatchcount = mismatchcount + 1;
								if (mismatchcount > 1) {

									return false;
								
							}
						}
					}

					
				

			return true;
	}
		
}
