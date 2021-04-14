package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		
		Address address = new Address("civic line", "Delhi", "India");
		Employee emp = new Employee(101, "King", "Sales", address);
		
		
		FileOutputStream fout = new FileOutputStream("d://employee.ser");
		ObjectOutputStream outstream = new ObjectOutputStream(fout);
		outstream.writeObject(emp);
		System.out.println("Object is serialized successfully.");
		outstream.close();
		fout.close();
		
	}

}
