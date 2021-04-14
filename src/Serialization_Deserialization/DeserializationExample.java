package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("d://employee.ser");
		ObjectInputStream outin = new ObjectInputStream(fin);
		Employee emp = (Employee)outin.readObject();
		System.out.println(emp);
		System.out.println("Object has been read successfully");
		outin.close();
		fin.close();

	}

}
