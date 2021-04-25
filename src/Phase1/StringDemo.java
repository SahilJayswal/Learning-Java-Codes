package Phase1;

public class StringDemo {

	public static void main(String[] args) {
		//Method of String
		System.out.println("Method of String");
		
		//Length of String
		String sl = new String("Hello World");
		System.out.println(sl.length());  			//.length() is to find length of String. Also count spaces between them.
		
		//SubString
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));	    //Print SubString from index[2] or after 2nd String letter
		
		//String Comparison
		String s1 = "Hello";
		String s2 = "Heldo";
		System.out.println(s1.compareTo(s2));       //Compare the string data
		System.out.println(s1==s2);                 //Compare reference or pointing of String
		
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());           //Provide true or false if string is empty or not

		//toLowerCase
		String s5="HELlo";
		System.out.println(s5.toLowerCase());	    //Convert String to lower case
				
		//replace
		String s6="Heldo";
		String replace=s6.replace('d', 'l');        //Replace 'd' with 'l'
		System.out.println(replace);

		//Equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));            //Return true if String is equal
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);	                    //Append or add both Strings

		//insert method
		s.insert(0, 'w');
		System.out.println(s);                      //Insert string at position index[0]

		//replace method
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(0, 2, "hEl");
		System.out.println(sb);	                    //Replace from Index[0]'H' to before Index[2]'e' or till Index[1]
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);                //Delete string from Index[0] to before Index[1] here only Index[0] will get deleted
				
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);	                 //Append or add both Strings

		System.out.println(sb1.delete(0, 1));        //'H' will get deleted from Happy
		System.out.println(sb1.insert(1, "Welcome"));//Welcome will get added in Index[1]

		System.out.println(sb1.reverse());	         //Reverse the String

		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
		String str = "Hello"; 
		        
		// conversion from String object to StringBuffer 
		StringBuffer sbr = new StringBuffer(str); 
		sbr.reverse(); 
		System.out.println("String to StringBuffer");
		System.out.println(sbr); 
		          
		// conversion from String object to StringBuilder 
		StringBuilder sbl = new StringBuilder(str); 
		sbl.append("world"); 
		
        System.out.println("String to StringBuilder");
        System.out.println(sbl);             	

		
	}

}
