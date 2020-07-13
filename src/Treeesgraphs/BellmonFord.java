package Treeesgraphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class BellmonFord {
	
	ArrayList<BellmonNode> nodelist = new ArrayList<BellmonNode>();

	public BellmonFord(ArrayList<BellmonNode> nodelist) {
		this.nodelist = nodelist;
	}

	//add directed edge between two vertices i and j
	public void addWeightedEdge(int i, int j, int k) {
		BellmonNode first = nodelist.get(i-1);
		BellmonNode second = nodelist.get(j-1);
		first.getNeighbours().add(second);
		first.getWeightedMap().put(second,k);
		
	}

	public void bellmonFord(BellmonNode node) {
		// TODO Auto-generated method stub
		
	}
	public void dijkshtra(BellmonNode node) {
		node.setDistance(0);
		PriorityQueue<BellmonNode> queue = new PriorityQueue<BellmonNode>();
		queue.addAll(nodelist);
		while(!queue.isEmpty()) {
			
			BellmonNode presentnode = queue.remove(); //remove node with minimum distance from queue
			for(BellmonNode neighbour : presentnode.getNeighbours()) {
				if(queue.contains(neighbour)) {
				if(neighbour.getDistance() > (presentnode.getDistance() + presentnode.getWeightedMap().get(neighbour))) {
					neighbour.setParent(presentnode);
					neighbour.setDistance(presentnode.getDistance() +presentnode.getWeightedMap().get(neighbour) );
				}
				//Refresh the Priority Queue 
				queue.remove(neighbour);
				queue.add(neighbour);
			}
		}
		}
		
	}

	public void printPath(BellmonNode node) {
		for(BellmonNode listNode : nodelist) {
		if(node.getParent()!=null) {
			printPath(node.getParent());
			System.out.print("->"+node.getName());
		}
		else 
			System.out.print(node.getName());
	}
	}
	
	

}
