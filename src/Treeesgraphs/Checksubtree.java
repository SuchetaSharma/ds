package Treeesgraphs;

public class Checksubtree {

	public boolean containsSubtree(BinaryNode t1Node, BinaryNode t2Node) {
		StringBuilder string1 = new StringBuilder();
		StringBuilder string2 = new StringBuilder();
	    getOrderString(t1Node, string1);
	    getOrderString(t2Node, string2);
	    return string1.indexOf(string2.toString()) != -1;
		
	}

	private void getOrderString(BinaryNode node, StringBuilder sb) {
		if(node == null) {
			sb.append("X");
			return;
		}
		sb.append(" "+node.value);	
		getOrderString(node.left, sb);
		getOrderString(node.right, sb);
		
	}

}
