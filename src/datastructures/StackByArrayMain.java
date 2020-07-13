package datastructures;

public class StackByArrayMain {

	public static void main(String[] args) {
		StackByArray arr = new StackByArray(5);
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		int i = arr.peek();
		System.out.println("i is"+i);
		arr.peek();
		int j = arr.peek();
		System.out.println("j is"+j);
		int k = arr.pop();
		System.out.println("k is"+k);
		System.out.println("peeked element is" + arr.peek());

	}

}
