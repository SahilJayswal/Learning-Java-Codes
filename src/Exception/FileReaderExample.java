package Exception;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		try{
			FileReader reader = new FileReader("D://demo.txt"); //Throws File Not Found Exception given by file reader
			int i;
			while((i= reader.read())!=-1) {
				System.out.print((char) i);  //Throws IOException
			}
			reader.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
