
public class TypeCastingExample {

	public static void main(String[] args) {
	
		System.out.println("----------------------------------------------------------------------------\n Implicit type casting");
		//Example of Implicit type casting. Conversion automatically perform by compiler
		byte b = 3;
		
		int a = b;
		short s = b;
		long l = b;
		float f = l;
		double d = a;
		
		System.out.println(b +" " + a + " " + s + " " + l + " " + f + " " +d);
		
		float f1 = 30.32f;
		double d1 = f1;
		
		System.out.println(d1);
		
		System.out.println("----------------------------------------------------------------------------\n Explicit type casting");
		
		//Explicit type casting
		//Using explicit type casting, we can override Java's default type conversions by explicitly specifying 
		//our own temporary data type according to the requirements. ... 
		//When we type cast a value, its data type is changed temporarily from its declared data type to the new data type.
	
		double d2 = 30.3456;
		float f2 = (float) d2;
		long l2 = (long) d2;
		short s2 = (short) d2;
		int i2 = (int) d2;
		byte b2 = (byte) d2;
		char c2 = (char) d2;
		
		System.out.println(d2);
		System.out.println(f2);
		System.out.println(l2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(b2);
		System.out.println(c2);

	}

}
