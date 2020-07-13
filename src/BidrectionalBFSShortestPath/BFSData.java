package BidrectionalBFSShortestPath;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * BFSData holds the data we need for a breadth-first search.
 * such as the isVisited hash table and the toVisit queue. 
 */
public class BFSData {
	
public Queue<PathNode> toVisit = new LinkedList<PathNode>();
public HashMap<Integer, PathNode> visited = new HashMap<Integer, PathNode>();

public BFSData(Person root) {
	PathNode sourcePath = new PathNode(root, null);
	toVisit.add(sourcePath);
	visited.put(root.getID(),sourcePath);
}

public boolean isFinished() {
	return toVisit.isEmpty();
}
}
