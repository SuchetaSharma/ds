package Treeesgraphs;

import java.util.ArrayList;
import java.util.List;

import node.BFSNode;

public class FindSuccessorMain {

	public static void main(String[] args) {
		FindSuccessor findSuccessorInstance = new FindSuccessor();
		BinaryNode node = new BinaryNode(1, null, null);
		node.left = new BinaryNode(2, null, null);
		node.right = new BinaryNode(3, null, null);
		node.left.left = new BinaryNode(4, null, null);
		node.left.right = new BinaryNode(5, null, null);
		node.right.left = new BinaryNode(6, null, null);
		node.right.right = new BinaryNode(7, null, null);
		int[] arr = new int[8];
		int[] successorArr = findSuccessorInstance.findSuccessor(node, arr);
		for(int i=1;i<successorArr.length - 1; i++) {
			System.out.println(successorArr[i]);
			if(successorArr[i] == 2) {
				System.out.println("successor is" + successorArr[i+1]);
			}
		}
		
		
	}
	

}
