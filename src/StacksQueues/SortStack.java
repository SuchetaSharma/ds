package StacksQueues;

import java.util.Stack;

public class SortStack {
	static Stack<Integer>  s1 = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		s1.add(5);
		s1.add(7);
		s1.add(2);
		s1.add(9);
		s1.add(1);
		s1.add(4);
		sortStack(s1);
		while(!s1.isEmpty()) {
			System.out.println("before"+s1.pop());
		}
	

	}
	public static void sortStack(Stack<Integer> s1) {
		Stack<Integer> r = new Stack<Integer>();
		
		while(!s1.isEmpty()) {
			int tmp = s1.pop();
		while(!(r.isEmpty()) && r.peek() > tmp) {
			s1.push(r.pop());
		}
		r.push(tmp);
	}
		//copy the elements from r back into s1,
		while(!r.isEmpty()) {
			s1.push(r.pop());
		}
	}

}
