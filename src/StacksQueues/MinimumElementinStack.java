package StacksQueues;

import java.util.Stack;
//Stack doesn’t hold actual value of an element if it is minimum so far.
//Actual minimum element is always stored in minEle.
public class MinimumElementinStack extends Stack<Integer> {
	
	//two rules
	//supp stack - pop will happen in supporting stack if top of both the stacks are same
	//push - element is inserted in supporting stack if top element of main stack is less than equal to the top of supporting stack
	
	//stores minimum value in the stack
			int minValue;
			Stack<Integer> s1;
			
			Stack<Integer> suppStack = new Stack<Integer>();
			// Constructor 
			MinimumElementinStack() { s1 = new Stack<Integer>(); } 
	public void push(int value){
		if(s1.isEmpty()) {
			
				s1.push(value);
				suppStack.push(value);
				minValue = value;
			
		}else {
			if(value < minValue) {
				s1.push(value);
				minValue = value;
			}else {
				
				s1.push(2*value - minValue);
				minValue = value;
			}
			
			if(value <= suppStack.peek()) {
				suppStack.push(value);
			}
			s1.push(value);
		}
		
	}
	
	public Integer pop(){
		if(s1 == null) {
			System.out.println("stack is empty");
			return null;
			
		}
			Integer t = s1.pop();
			if( t == suppStack.peek()) {
				suppStack.pop();
			}
			if(t< minValue) {
				//System.out.println(t);
				return t;
			}else {
				//System.out.println(minValue);
				// Minimum will change as the minimum element 
		        // of the stack is being removed. 
				minValue = 2*t - minValue;
				
				return minValue;
			}
	
		
	}
	
	public Integer peek(){
		if(s1 == null) {
			System.out.println("stack is empty");
			return null;
			
		}
			Integer t = s1.peek();
			if(t< minValue) {
				//System.out.println(t);
				return t;
			}else {
				
				
				//System.out.println(minValue);
				return minValue;
			}
	
		
	}
	
	
	public void getMin() {
		if(s1 == null) {
			System.out.println("stack is empty");
			return;
		}else {
			//System.out.println(minValue);
			System.out.println(suppStack.peek());
		}
		
	}
	

}
