package StacksQueues;

import java.util.Stack;

public class BalancedParanthesisStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean blnFlag = isBalanced("{[]}");
		System.out.println(blnFlag);

	}

	private static boolean isBalanced(String string) {
		Stack<Character> stack = new Stack();
		for(int i = 0; i< string.length(); i++) {
			if(string.charAt(i) == '(' || string.charAt(i) == '{'  || string.charAt(i) == '[' ) {
				stack.push(string.charAt(i));
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char pop_val = stack.pop();
					if(string.charAt(i) == ')' && pop_val != ('(')) {
						return false;
					} else if(string.charAt(i) == '}' && pop_val != ('{')) {
						return false;
					}
					else if(string.charAt(i) == '[' && pop_val != (']')) {
						return false;
					}
				}
			}
			
		}
		if(!stack.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

}
