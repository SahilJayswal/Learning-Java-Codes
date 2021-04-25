package Phase1;

class SecondThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Second thread running!!!");
	}
	
}

public class RunnableThreadExmpl {

	public static void main(String[] args) {

		SecondThread st1 = new SecondThread();
		Thread t1 = new Thread(st1);
		//st1.run();
		t1.start();

	}

}
