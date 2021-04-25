package Phase1;

//Parent Class
public class ClassMain {
	private String msg = "This is Inner Class";
	
	//Inner Class
	class InnerClass{
		void msg() {
			System.out.println(msg);
		}
	}
 
	public static void main(String[] args) {
		ClassMain obj = new ClassMain();
		ClassMain.InnerClass inner= obj.new InnerClass();
		inner.msg();
	}
}
