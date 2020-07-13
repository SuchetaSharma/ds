package dynamicprogram;

import java.util.ArrayList;

public class EightQueens {

	public static void main(String[] args) {
		/*
		 * Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board.
		 *  so that none of them share the same row, column, or diagonal. In this case, "diagonal".
		 *  means all diagonals, not just the two that bisect the board.
		 */
		/*
		 * Picture the queen that is placed last, which we'll assume is on row 8.
		 * (This is an okay assumption to make since the ordering of placing the queens is irrelevant.) .
		 * On which cell in row 8 is this queen? There are eight possibilities, one for each column.
		 */
		/* Observe that since each row can only have one queen, we don't need to store our board as a full.
		 * 8x8 matrix. We only need a single array where column [ r] = c indicates that row r has a queen at column c.
		 * 
		 */
	
		

	}
	void placeQueeens(int row, Integer[] columns, ArrayList<Integer[]> results) {
		int GRID_SIZE = 8;
		if(row == GRID_SIZE) { //found valid placement
			results.add(columns.clone());
		}else {
			for(int col = 0; col <GRID_SIZE; col ++) {
				if(checkValid(columns, row, col)) {
					columns[row] = col; //place queen
					placeQueeens(row+1, columns, results);
				}
				
			}
		}
	}
	
/*
/* Check if (rowl, column!) is a valid spot for a queen by checking if there is a * queen in the same column or diagonal. We don't need to check it for queens in
* the same row because the calling placeQueen only attempts to place one queen at * a time. We know this row is empty. */
	
	private boolean checkValid(Integer[] columns, int row1, int col1) {
		for(int row2 = 0; row2 < row1; row2++) {
			int col2 = columns[row2];
			
			if (col1 == col2) {
				return false;
			}
			
			/* Check diagonals: if the distance between the columns equals the distance
			* between the rows, then they're in the same diagonal. */
			
			int colDis = Math.abs(col2 - col1);
			int rowDis = row1 - row2;
			if(colDis == rowDis) {
				return false;	
			}
			
		}	
		return true;
	}


}
