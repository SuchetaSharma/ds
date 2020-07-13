package dynamicprogram;

public class HouseThiefMain {

	// There are many houses with some money. Thief to do a chori with maximum stolen value. Restriction is that the
	//thief cannot go in two adjacent houses	
	public static void main(String[] args) {
		
		int[] houseArr = {1,2,3,4,5,6,7};
			HouseThief housethief = new HouseThief();
			int[] memo = new int[houseArr.length + 1];
			housethief.calculateCost(houseArr, 0,memo);
}
}
