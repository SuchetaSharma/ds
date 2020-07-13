package dynamicprogram;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RobotinaGrid {

	public static void main(String[] args) {
		/*
		 * Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns. 
		 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that the robot cannot step on them. 
		 * Design an algorithm to find a path for the robot from the top left to the bottom right.
		 */
		boolean[][] maze = {
				{true, true, true},
				{true, false, false},
				{false, true, true}
		};
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedpoints = new HashSet<Point>();
		boolean blnFlag = getPath(maze, maze.length -1, maze[0].length -1, path,failedpoints);
		if(blnFlag) {
			for(Point point:path) {
				System.out.println(point.row + " "+point.col);
			}
		}

	}

	private static boolean getPath(boolean[][] maze, int r, int c, ArrayList<Point> path, HashSet<Point> failedpoints) {
		if(r<0 || c<0 || !maze[r][c]) {
			return false;
		}
		Point point = new Point(r,c);
		if(failedpoints.contains(point)) {
			return false;
		}
		boolean isAtOrigin = (r ==0) && (c == 0);
		if(isAtOrigin || getPath(maze, r-1, c, path, failedpoints) || getPath(maze, r, c-1, path, failedpoints)) {
			
		    path.add(point);
			return true;
		}
		failedpoints.add(point);
		return false;
	}

}
