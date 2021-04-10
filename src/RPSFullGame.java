import java.util.Random;
import java.util.Scanner;

public class RPSFullGame {

	public static void main(String[] args) {
		
		RPSFullGame rps = new RPSFullGame();
			rps.UserInput();
		
	}
		
		void UserInput() {
			System.out.println("Enter 0 For Rock\n"+"Enter 1 For Paper\n"+"Enter 2 For Scissor");
			System.out.print("\nPlease Enter Your selection: ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			try {
				switch (a) {
				case 0 :
					System.out.println("You have selected: Rock");
					ComputerInput(a);
					break;
				case 1 :
					System.out.println("You have selected: Paper");
					ComputerInput(a);
					break;
				case 2 :
					System.out.println("You have selected: Scissor");
					ComputerInput(a);
					break;
				default :
					System.out.println("Please Select number between 0 , 1 or 2 Only " + "Try Again");
					UserInput();
				}
			}
		catch(Exception e) {
			UserInput();
		}
			
				
	}
		void ComputerInput(int a) {
			Random ran = new Random();
			int ran1 = ran.nextInt(3);
			System.out.println();
			System.out.println("Computer Selection: ");
			
			switch (ran1) {
			case 0 :
				System.out.println("Computer selected: Rock");
				break;
			case 1 :
				System.out.println("Computer selected: Paper");
				break;
			case 2 :
				System.out.println("Computer selected: Scissor");
				break;
			default :
				System.out.println("Please Enter number between 0 to 2");
		}
			System.out.println();
			if(ran1==0 && a==2){
				System.out.println("Computer is winner: " + "Rock smashed the Scissor") ;
			}
			else if(a==0 && ran1==2){
				System.out.println("You are winner: " + "Rock smashed the Scissor") ;
			}
			
			else if(ran1==2 && a==1) {
				System.out.println("Computer is winner: " + "Scissor cuts Paper") ;
			}
			else if(a==2 && ran1==1) {
				System.out.println("You are winner: " + "Scissor cuts Paper") ;
			}
			
			else if(ran1==1 && a==0){
				System.out.println("Computer is winner: " + "Paper wraps Rock") ;
			}
			else if(a==1 && ran1==0) {
				System.out.println("You are winner: " + "Paper wraps Rock") ;
			}
			else {
				System.out.println("Both selections are same");
			}
				
}
}

