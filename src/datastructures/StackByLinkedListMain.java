package datastructures;

public class StackByLinkedListMain {

	public static void main(String[] args) {
		StackByLinkeedList list = new StackByLinkeedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		int i = list.peek();
		System.out.println("i is"+i);
		list.peek();
		int j = list.peek();
		System.out.println("j is"+j);
		int k = list.pop();
		System.out.println("k is"+k);
		System.out.println("peeked element is" + list.peek());

	}

}
