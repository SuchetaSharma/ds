package elevenessential;

public class OneArrayARotationofAnother {
	//assumption no duplicates, o(m+n)
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2 = {4,5,6,7,1,2,3};
		System.out.println(oneArrayisaRotationOfAnother(array1, array2));
		
	}

	private static boolean oneArrayisaRotationOfAnother(int[] array1, int[] array2) {
		if(array1.length != array2.length) {
			return false;
		}
		int firstElement = array1[0];
		int keyloc = -1;
		for (int i =0; i < array2.length; i++) {
			if(array2[i] == firstElement) {
				keyloc = i;
				break;
			}
		}
		if(keyloc == -1) {
			return false;
		}
		for(int i=0; i< array1.length; i++) {
			int j = (keyloc + i) % array1.length;
			if (array1[i] != array2[j]) {
				return false;
			}
			
		}
		return true;
	}

}
