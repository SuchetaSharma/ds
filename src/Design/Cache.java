package Design;

import java.util.Hashtable;
import java.util.LinkedList;

import node.SingleNode;

//single machine
public class Cache {
	LinkedList<SingleNode> list = null;
	Hashtable<String, SingleNode> table = null; // wee can use HashMap
	public Cache() {
	list = new LinkedList<SingleNode>();
	table = new Hashtable<String, SingleNode>();
	}
	public int getResults(String string) {
		if(table.contains(string)) {
			SingleNode node = table.get(string);
			movetoFront(node);
			return node.getValue();
		}
		return -1;
		
	}
	private void movetoFront(SingleNode node) {
		list.addFirst(node);
		
	}
	public void insertResults(String query, String[] results) {
		SingleNode node = table.get(query);
		node.setValue(1);//results
		if(table.contains(query)) {
			//update
			
			movetoFront(node);
			return;
			
		}else {
			if(list.size() >= 10) {
				removeLastNode();
			}
			list.add(node);
			movetoFront(node);
			table.put(query, node);
			
		}
		
	}
	private void removeLastNode() {
		list.removeLast();
		table.remove(list.getLast());
		
	}
	
}
