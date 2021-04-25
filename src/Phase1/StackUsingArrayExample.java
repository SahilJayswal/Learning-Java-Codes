package Phase1;

import java.util.Arrays;

class stack{
	private int[] item = new int[5];
	private int count;
	
	public void push(int items) {
		if(count == item.length) {
			throw new StackOverflowError();
		}
		item[count++]=items;
	}
	
	public int pop() {
		if(count==0) {
			throw new IllegalStateException();
		}
		return item[--count];
	}
	public int peek() {
		return item[count - 1];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(item, 0, count));
	}
}


public class StackUsingArrayExample {

	public static void main(String[] args) {
		stack stack = new stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		// stack.push(400);
		// stack.push(500);
		System.out.println(stack);
		System.out.println("Element Popped Out is : " + stack.pop());
		System.out.println("Element ready to Pop : " + stack.peek());
		System.out.println(stack);
		
	

	}

}
