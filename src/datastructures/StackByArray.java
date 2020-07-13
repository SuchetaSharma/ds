package datastructures;

public class StackByArray {
	private int topOfStack;
	private int[] arr;
	
	StackByArray(int size){
		arr = new int[size];
		topOfStack = 0;
	}
	public void push(int i) {
		if(!isStackFull()) {
			topOfStack++;
			arr[topOfStack] = i;
			
			System.out.println("Successfully inserted");
		}else {
			
			System.out.println("The stack is full!");
		}
	}
	
	private boolean isStackFull() {
	
		if(topOfStack == arr.length - 1)
			return true;
		
		return false;
	}
	public int pop() {
		if(!isStackEmpty()) {
			int i = arr[topOfStack];
			topOfStack--;
			System.out.println("Successfully popped" + i);
			return i;
		}else {
			System.out.println("The stack is empty!");
			return -1;
		}
	}
	

	private boolean isStackEmpty() {
		if(topOfStack == -1)
			return true;
		
		return false;
	}
	public int peek() {

		if(!isStackEmpty()) {
			int i = arr[topOfStack];
			
			System.out.println("Successfully peeked" + i);
			return i;
		}else {
			System.out.println("The stack is empty!");
			return -1;
		}
	}
	
	public void deleteStack() {
		arr = null;
		System.out.println("stack deleted successfully!");
		
	}

}
