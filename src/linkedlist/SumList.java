package linkedlist;

import elevenessential.Node;

public class SumList {
	//Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
	//Output:2 -> 1 -> 9.Thatis,912.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = null;
		Node node1 = null;
		int num1 = 617;
		int num2 = 295;
		int rem = 0;
		
		while (num1 > 0) {
			rem = num1%10;
			
			node = new Node(rem, node);
			//node.setNext(node);
			num1/=10;
		}
		
		while (num2 > 0) {
			rem = num2%10;
			
			node1 = new Node(rem, node1);
			//node.setNext(node);
			num2/=10;
		}
		Node result = sumofNumbers(node, node1,0);
		while (result != null) {
			System.out.println(result.getVal());
			result = result.getNext();
		}
	
	}

	private static Node sumofNumbers(Node node1, Node node2, int carry) {
		
		if(node1 == null && node2 == null && carry == 0) {
			return null;
		}
		Node result = new Node(0,null);
		int value = carry;
		if(node1 != null) {
			System.out.println("node1" + node1.getVal());
			value += node1.getVal();
		}
		if(node2 != null) {
			System.out.println("node2" + node2.getVal());
			value += node2.getVal();
		}
		result.setVal(value%10); //second digit
		System.out.println("result" + result.getVal());
		//recursion
		if(node1 != null || node2 != null) {
			Node more = sumofNumbers(node1 == null? null : node1.getNext(), node2 == null? null: node2.getNext(), value >=10?1:0);
			result.setNext(more);
		
		}
		
		return result;
	}

}
