package CrackingtheCode;

import java.util.Hashtable;
import java.util.Map;

//page 69
public class EquationProblem {
	// n = 1-1000, find pairs where a cube + b cube = c cube + d cube
	
	public static void main(String[] args) {
		findThePairs(20);

	}

	private static void findThePairs(int i) {
		Hashtable<Double, String> map = new Hashtable<Double, String>();
		for (int c=1;c <= i;c++) {
			for(int d=1; d <= i; d++) {
			map.put(Math.pow(c, 3) + Math.pow(d, 3),"" + c + "," + d + "");
			}
		}
		
		for (Map.Entry mapElement : map.entrySet()) { 
            String key = (String)mapElement.getKey(); 
  
            String value = (String) mapElement.getValue();
            
		}
		
		int[] resultList = null;
		Double result = null;
		for (int a=1;a <= i;a++) {
			for(int b=1; b <= i; b++) {
				result = Math.pow(a, 3) + Math.pow(b, 3);
				resultList = map.get(result);
				for(int j = 0; j< resultList.length; j++) {
					System.out.println(a + "," + b  + "," + resultList[j]);
				}
			}
		
	}

}
