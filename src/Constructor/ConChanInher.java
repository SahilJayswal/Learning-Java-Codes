package Constructor;

class Person{
	int id;
	String name;
	
	public Person() {
		this.id=101;
		this.name="King";
	}
	public Person(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("Id: " +id+ "Name: "+name);
	}
}

class Customer extends Person{
	float amount;
	public Customer() {
		super();
		this.amount=10572.99f;
	}
	public Customer(int id, String name, float amount) {
		super(id,name);
		this.amount=amount;
		
	}
	public void display() {
		System.out.println("Amount: "+ amount);
	}
}

public class ConChanInher {

	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.display();
	}

}
