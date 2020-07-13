package elevenessential;

public class MineSweeper {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] bombs = {{0, 0}, {0, 1}, {1, 2}};
		 // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

		int[][] arr = mineSweeperLogic(bombs, 3, 4);
		for(int i=0; i<3; i++) 
		{ for(int j=0; j<4; j++) {
			System.out.println(arr[i][j]);
			 
			 } 
		}
	}
	//in the metrix, -1 should be for bomb and adcent blocks will be increemented by 1
	private static int[][] mineSweeperLogic(int[][] bombs, int rows, int columns) {
		/*
		 * // TODO Auto-generated method stub int [][] arr = new int[rows][columns]; arr
		 * = bombs;
		 * 
		 * for(int i=0; i<rows; i++) { for(int j=0; j<columns; j++) {
		 * System.out.println(arr[i][j]);
		 * 
		 * } }
		 * 
		 * for(int i=0; i<rows; i++) { for(int j=0; j<columns; j++) { if(arr[i][j] ==
		 * -1) { if(arr[i+1][j] != -1) { arr[i+1][j] += 1; } if(arr[i][j+1] != -1) {
		 * arr[i][j+1] += 1; } if(arr[i+1][j+1] != -1) { arr[i+1][j+1] += 1; } if(i > 0
		 * && j>0) { if(arr[i-1][j-1] != -1) { arr[i-1][j-1] += 1; } } if(i>0) {
		 * if(arr[i-1][j] != -1) { arr[i-1][j] += 1; } } if(j>0) { if(arr[i][j-1] != -1)
		 * { arr[i][j-1] += 1; } } } } } System.out.println("after"); for(int i=0;
		 * i<rows; i++) { for(int j=0; j<columns; j++) { System.out.println(arr[i][j]);
		 * 
		 * } }
		 */

        int[][] field = new int[rows][columns];
        for (int[] bomb: bombs) {
            int rowIndex = bomb[0];
            int colIndex = bomb[1];
            field[rowIndex][colIndex] = -1;
            for(int i = rowIndex - 1; i < rowIndex + 2; i++) {
                for (int j = colIndex - 1; j < colIndex + 2; j++) {
                    if (0 <= i && i < rows &&
                            0 <= j && j < columns &&
                            field[i][j] != -1) {
                        field[i][j] += 1;
                    }
                }
            }
        }
        return field;
	
	
	}
	
	}


