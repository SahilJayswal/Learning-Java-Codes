package Exception;

class AgeException extends Exception {
	 
	private static final long serialVersionUID = 1L;
	
	 public AgeException() {
		 super("You are not valid to vote!!!");
	 }
	 public AgeException(String message) {
		 super(message);
	 }
}

public class CustomException {
	
	static void validate(int a) throws AgeException {
		if(a<18) {
//			System.out.println("You are not valid to vote");
			throw new AgeException();
		}else {
			System.out.println("You are valid to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(14);
		
	}catch(AgeException e) {
		System.out.println("Exception: " + e.getMessage());
	}
}
}
