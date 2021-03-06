package dynamicprogram;

public class TowerOfHonai {

	/*
	 * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. 
	 * The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:
(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3) A disk cannot be placed on top of a smaller disk.
Write a program to move the disks from the first tower to the last using Stacks
	 */
	
	public static void main(String[] args) {
		Tower buffer = null;
		Tower origin = null;
		Tower destination = null;
		int n = 0;
		/* move top n - 1 disks from origin to buffer, using destination as a buffer. */
		moveDisks( n,  origin,  buffer,  destination);
		moveDisks(n-1, origin,buffer, destination );
		moveTop(origin, destination);
		moveDisks(n-1, buffer, destination, origin);

	}

	private static void moveTop(Tower origin, Tower destination) {
		// TODO Auto-generated method stub
		
	}

	private static void moveDisks(int n, Tower origin, Tower destination, Tower buffer) {
		if(n < 0) return;
		
	}

}
