package Treeesgraphs;

import java.util.LinkedList;
import java.util.Queue;

//O(n) - space and time
public class BFSPreparation {

	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		LinkedList<BinaryNode> list = new LinkedList();
		list.add(root.left);
		list.add(root.right);
		root.setNeighbours(list);
		bfs(root);
		insert(new BinaryNode(4, null, null));
		deleteNodeOfBinaryTree(root, 4);
	}

	private static void insert(BinaryNode root) {

		BinaryNode node;
		if(root == null) {
			return;
		}
		Queue queue = new LinkedList();
		queue.add(root);
		
		
		while(!queue.isEmpty()) {
			node = (BinaryNode)queue.remove();
			node.setVisited(true);
			LinkedList<BinaryNode> list = new LinkedList<BinaryNode>();
			System.out.println(node.value);
			if(node.getNeighbours().size() == 2) {
				continue;
			}else {
			for(BinaryNode neighbour : node.getNeighbours()) {
				if(neighbour != null) {
				if(!neighbour.isVisited()) {
					queue.add(neighbour);
					
				}
				}else {
					list.add(root);
					node.setNeighbours(list);
					return;
				}
			}
			}
		}
		
	
		
	}

	
	// delete node from binary tree
		static void deleteNodeOfBinaryTree(BinaryNode root,int value) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode node;
			while(!queue.isEmpty()) {
				node = (BinaryNode)queue.remove();
				node.setVisited(true);
				System.out.println(node.value);
				for(BinaryNode neighbour : node.getNeighbours()) {
					if(neighbour != null) {
						if(neighbour.value == value) {
							node.value = getDeepestNode().value;
							DeleteDeepestNode();
						}
					
					}
					
				}
			}
			
			
				
		
		
		//Delete deepest node
		public void DeleteDeepestNode() {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode previousNode, presentNode = null;
			while (!queue.isEmpty()) {
				previousNode = presentNode;
				presentNode = queue.remove();
				if (presentNode.getLeft() == null) {
					previousNode.setRight(null);
					return;
				}else if ((presentNode.getRight() == null)) {
					presentNode.setLeft(null);
					return;
				}
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}//end of while loop
		}//end of method

		
		
		// get last node of last level of binary tree
		public BinaryNode getDeepestNode() {
			// make an empty queue. Queue is Interface and LinkedList is class
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode = null;
			while (!queue.isEmpty()) {
				presentNode = queue.remove();
				if (presentNode.getLeft() != null)
					queue.add(presentNode.getLeft());
				if (presentNode.getRight() != null)
					queue.add(presentNode.getRight());
			}
			return presentNode;
		}//end of method
		
		
		
	
	
	private static void bfs(BinaryNode root) {
		BinaryNode node;
		if(root == null) {
			return;
		}
		Queue queue = new LinkedList();
		queue.add(root);
		
		
		while(!queue.isEmpty()) {
			node = (BinaryNode)queue.remove();
			node.setVisited(true);
			System.out.println(node.value);
			for(BinaryNode neighbour : node.getNeighbours()) {
				if(neighbour != null) {
				if(!neighbour.isVisited()) {
					queue.add(neighbour);
					
				}
				}
				
			}
		}
		
	}

}
