package Exception;

public class ThrowKeywordExample {
	
	static void validate(int a) {
		if(a<18) {
//			System.out.println("You are not valid to vote");
			throw new ArithmeticException("You are not valid to vote");
		}else {
			System.out.println("You are valid to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(14);
		
	}catch(ArithmeticException e) {
		System.out.println("Exception: " + e.getMessage());
	}
}
}
