package StringsandArraysCC;

public class StringRotation {

	public static void main(String[] args) {
		boolean blnFlag= stringRotation("sucheta","etasuch");
		System.out.println(blnFlag);

	}

	private static boolean stringRotation(String str1, String str2) {
		
		// TODO Auto-generated method stub
		if(str1.length() == str2.length() && str1.length() > 0) {
			String str1str1 = str1 + str1;
			System.out.println(str1str1);
			return str1str1.contains(str2);
		}
		return false;
	}

}
