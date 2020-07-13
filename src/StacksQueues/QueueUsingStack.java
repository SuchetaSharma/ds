package StacksQueues;

import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> stacknewest = new Stack<Integer>();
	static Stack<Integer> stackoldest = new Stack<Integer>();

	public static void main(String[] args) {
		//implement queue using two stacks
				add(5);
				add(6);
				add(7);
				add(8);
				add(9);
				pop();
				peek();
		
		

	}

	private static void peek() {

		shiftStacks();
		int i = stackoldest.peek();
		System.out.println("peeked" + i);
		
	}

	private static void pop() {
		shiftStacks();
		int i = stackoldest.pop();
		System.out.println("popped" + i);
		
	}

	private static void shiftStacks() {
		while(!stacknewest.isEmpty()) {
			stackoldest.push(stacknewest.pop());
		}
		
	}

	private static void add(int i) {
		stacknewest.push(i);
		
	}

}
