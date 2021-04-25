package model;

class Base{
	Base(){
		System.out.println("Base");
	}
	Base(int a){
		System.out.println("Base" + a);
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("Derived");
	}
	Derived(int b){
		super();
		System.out.println("Derived" + b);
	}
}

public class ConExmpl {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived d = new Derived(5);
		
	}

}
