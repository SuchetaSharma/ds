package elevenessential;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NonRepeatingCharacters {

	public static void main(String[] args) {
		String str = "SuchetaaaassssSSSS";
		ArrayList list = nonRepeatingCharacters(str);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		ArrayList list1 = nonFirstRepeatingCharacter(str);
		System.out.println("ssssssssss");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		


	}
	//return all the non repeating characters
	private static ArrayList nonRepeatingCharacters(String str) {
		ArrayList list = new ArrayList();
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			if(!list.contains(charArr[i])) {
				list.add(charArr[i]);
			}
		}
		return list;
	}
	
	//return first non repeating character
	private static ArrayList nonFirstRepeatingCharacter(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(map.containsKey(Character.toString(charArr[i]))) {
				
				Integer newVal = map.get(Character.toString(charArr[i])) + 1;
				map.put(Character.toString(charArr[i]), newVal);
			}else {
				map.put(Character.toString(charArr[i]), 1);
			}
		}
		ArrayList arr = new ArrayList();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				arr.add(entry.getKey());
			}
		}
		return arr;
	}

}
