package Phase1;

import java.util.Stack;

public class ReverseStringStackExample {
	
	public static String Reverse(String Input) {
		String reversed = "";
		Stack<Character> stack = new Stack<Character>();
		for(char ch : Input.toCharArray()) {
			stack.push(ch);
		}
		while(!stack.isEmpty()) {
			reversed += stack.pop();
		}
		return reversed;
	}

	public static void main(String[] args) {
		
		String OriginalString = "abcd";
		String ReverseString = Reverse(OriginalString);
		System.out.println("Original String: " + OriginalString);
		System.out.println("Reverse String: " + ReverseString);
		
		if(OriginalString.equals(ReverseString)) {
			System.out.println("Palindrome!!!");
		}else {
			System.out.println("Not Palindrome!!!");
		}
		
	}

}
