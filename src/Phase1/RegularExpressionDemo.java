package Phase1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		/*A regular expression can be a single character, or a more complicated pattern. 
		 * Regular expressions can be used to perform all types of text search and text replace operations. 
		 * Java does not have a built-in Regular Expression class, 
		 * but we can import the java. util. regex package to work with regular expressions.
		 */
		
		
		String pattern = "[a-z]+";
		String check = "Regular Expression";
		
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while(c.find()) {
			System.out.println(check.substring(c.start(), c.end()));
		}
		
		}

}
