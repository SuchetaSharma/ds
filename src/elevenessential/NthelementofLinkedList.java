package elevenessential;


public class NthelementofLinkedList {
	
	//function which returns nth element in a linked list from the end
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
        Node node = getNthelement(head, 10);
        if(node != null) {
        System.out.println("node value" + node.getVal());
        }else {
        	System.out.println("node is null");
        }
}
	


    // First, make sure that we have at least n items in the linked list.
    private static Node getNthelement(Node head, int n) {
Node right = head;
Node left = head;
    	for(int i = 0; i < n; i++) {
            if (right == null) return null;
            right = right.getNext();
        }
        while (right != null) {
            right = right.getNext();
            left = left.getNext();
        }
        return left;

		
	}




}
