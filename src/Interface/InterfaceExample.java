package Interface;

abstract class IMyAbstract{
	abstract void myfunc();
}
interface IBank{
	void openaccount();
	void closeaccount();
}
interface IBankAccount{
	void deposite();
	void withdraw();
	void balance();
}
class SavingAccount extends IMyAbstract implements IBankAccount, IBank{

	@Override
	public void deposite() {
		System.out.println("Deposite in Saving Account!!!");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Saving Account!!!");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account!!!");
		
	}

	@Override
	public void openaccount() {
		System.out.println("Open Account in Saving Account!!!");
		
	}

	@Override
	public void closeaccount() {
		System.out.println("Close Account in Saving Account!!!");
		
	}

	@Override
	void myfunc() {
		// TODO Auto-generated method stub
		
	}
	
}

class CurrentAccount extends IMyAbstract implements IBankAccount, IBank{

	@Override
	public void deposite() {
		System.out.println("Deposite in Current Account!!!");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Current Account!!!");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in Current Account!!!");
		
	}

	@Override
	public void openaccount() {
		System.out.println("Open Account in Current Account!!!");
		
	}

	@Override
	public void closeaccount() {
		System.out.println("Close Account in Current Account!!!");
		
	}

	@Override
	void myfunc() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount();
		sa.openaccount();
		sa.deposite();
		sa.withdraw();
		sa.balance();
		sa.closeaccount();
		
		System.out.println("--------------------------------------------");
		
		CurrentAccount ca = new CurrentAccount();
		ca.openaccount();
		ca.deposite();
		ca.withdraw();
		ca.balance();
		ca.closeaccount();
		
		
	}

}
