package Treeesgraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import node.BFSNode;

//this problem is called topological sort.
//linearly ordering the vertices in a graph such that for every edge (a, b), a appears before b in the linear order.
//if some other vertex is dependent on current vertex, go to that vertex and then come to current vertex. Else. add the current vertex in stack.
public class TopologicalSort {
	/*
	 * You are given a list of projects and a list of dependencies. (which is a list
	 * of pairs of projects,wherethesecondprojectisdependentonthefirstproject).
	 * Allofaproject'sdependencies must be built before the project is. Find a build
	 * order that will allow the projects to be built. If there is no valid build
	 * order, return an error.
	 * 
	 */
	public static void main(String[] args) {
		// Nodes with no incoming edges can be built immediately since they don't depend
		// on anything.
		// we can use depth-first search (DFS) to find the build path.

		List<BFSNode> bFSLinkedList = new ArrayList<BFSNode>();
		BFSNode nodeA = new BFSNode(10);
		BFSNode nodeB = new BFSNode(20);
		BFSNode nodeC = new BFSNode(30);
		BFSNode nodeD = new BFSNode(40);
		BFSNode nodeE = new BFSNode(50);
		bFSLinkedList.add(nodeA);
		bFSLinkedList.add(nodeB);
		bFSLinkedList.add(nodeC);
		bFSLinkedList.add(nodeD);
		bFSLinkedList.add(nodeE);
		BFSNode root = bFSLinkedList.get(0);

		int[][] arr = { { 0, 1, 1, 0, 0 }, // A
				{ 1, 0, 0, 1, 1 }, // B
				{ 1, 0, 0, 0, 0 }, // C
				{ 0, 1, 0, 0, 0 }, // D
				{ 0, 1, 0, 0, 0 }// E
		};
		topologicalSort(root, bFSLinkedList, arr);

	}

	private static void topologicalSort(BFSNode root, List<BFSNode> bFSLinkedList, int[][] arr) {

		Stack<BFSNode> stack = new Stack<BFSNode>();

		for (int i = 0; i < bFSLinkedList.size(); i++) {
			BFSNode node = bFSLinkedList.get(i);
			//System.out.println(node.getVal());
			if (!node.isVisited()) {
				topologicalVisit(node, stack, bFSLinkedList, arr);

				// }
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

	private static void topologicalVisit(BFSNode node, Stack<BFSNode> stack, List bFSLinkedList, int[][] arr) {
		for (BFSNode neighbour : getNeighbours(node, bFSLinkedList, arr)) {
			if (!neighbour.isVisited()) {
				
				topologicalVisit(neighbour, stack, bFSLinkedList, arr);
			}

		}
		node.setVisited(true);
		stack.push(node);
		

	}

	private static Collection<BFSNode> getNeighbours(BFSNode node, List bFSLinkedList, int[][] arr) {
		List<BFSNode> neighbours = new ArrayList<BFSNode>();
		int rowIndex = getRowIndex(node, bFSLinkedList);
		int[] row;
		if (rowIndex >= 0) {
			row = arr[rowIndex];
			for (int i = 0; i < row.length; i++) {
				if (row[i] == 1) {
					neighbours.add((BFSNode) bFSLinkedList.get(i));
					// System.out.println(neighbours.get(i).getVal());
				}
			}
		} else {
			return null;
		}

		return neighbours;
	}

	private static int getRowIndex(BFSNode node, List bFSLinkedList) {
		for (int i = 0; i < bFSLinkedList.size(); i++) {
			if (bFSLinkedList.get(i) == node) {
				return i;
			}
		}
		return -1;
	}

}
