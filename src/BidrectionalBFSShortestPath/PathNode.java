package BidrectionalBFSShortestPath;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * PathNode will represent the path as we're searching it.
 * storing each Person and the previousNode we visited in this path
 */
public class PathNode {

	private Person person = null;
	private PathNode previousNode = null;
	public PathNode(Person person, PathNode previousNode) {
		this.person = person;
		this.previousNode = previousNode;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public LinkedList<Person> collapse(boolean startsWithRoot){
		LinkedList<Person> path = new LinkedList<Person>();
		PathNode node = this;
		while(null != node) {
			if(startsWithRoot) {
				path.addLast(node.person);
			}else {
				path.addFirst(node.person);
			}
			node = node.previousNode;
		}
		return path;
	}

	public ArrayList<Integer> getFriends() {
		// TODO Auto-generated method stub
		return null;
	}
}
