package BidrectionalBFSShortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class BFSShortestPath {

	LinkedList<Person> findPathBiBFS(HashMap<Integer, Person> people, int source, int destination) {
		BFSData sourceData = new BFSData(people.get(source));
		BFSData destData = new BFSData(people.get(destination));

		while (!sourceData.isFinished() && !destData.isFinished()) {
			// search out from source
			Person collision = searchLevel(people, sourceData, destData);
			if (collision != null) {
				return mergePaths(sourceData, destData, collision.getID());
			}

			// search out from destination
			collision = searchLevel(people, destData, sourceData);
			if (collision != null) {
				return mergePaths(sourceData, destData, collision.getID());
			}
		}
		return null;
	}

	//merge the paths where searches met at connection
	private LinkedList<Person> mergePaths(BFSData bfs1, BFSData bfs2, int connection) {
		PathNode endl = bfs1.visited.get(connection); // endl -> source
			PathNode end2 = bfs2.visited.get(connection); // end2 -> dest
			LinkedList<Person> pathOne = endl.collapse(false);
			LinkedList<Person> pathTwo = end2.collapse(true); // reverse
			pathTwo.removeFirst(); // remove connection
			pathOne.addAll(pathTwo); // add second path
			return pathOne;
		}
	
	// search one level and return collision if any
	private Person searchLevel(HashMap<Integer, Person> people, BFSData primary, BFSData secondary) {
		/*
		/*We only want to search one level at a time. Count how many nodes are
		*currently in the primary's level and only do that many nodes. We'll continue
		*to add nodes to the end.*/
		 int count = primary.toVisit.size();
		 for(int i=0; i< count; i++) {
			 //pull out first node
			 PathNode pathNode = primary.toVisit.poll();
			 int personID = pathNode.getPerson().getID();
			 
			 
			 //check if it is already been visited
			 if(secondary.visited.containsKey(personID)) {
				 return pathNode.getPerson();
			 }
			 
			 //add friends to queue
			 ArrayList<Integer> friends = pathNode.getFriends();
			 for(int friendid: friends) {
				 if (!primary.visited.containsKey(friendid)) {
					 Person friend= people.get(friendid);
					 PathNode next = new PathNode(friend, pathNode);
					 primary.visited.put(friendid, next);
					 primary.toVisit.add(next);
				 }
			 }

		 }
		return null;
	}
}
