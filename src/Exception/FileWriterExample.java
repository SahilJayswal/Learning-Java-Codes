package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
public static void main(String[] args) {
	
	try {
		FileWriter Writer = new FileWriter("D://demo.txt");
		Writer.write("Hello World");
		System.out.println("The Content written to file successfully");
		Writer.close();
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
}
}
