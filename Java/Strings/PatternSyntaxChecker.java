/*
 * Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer N, denoting the number of testcases. 
The next N lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each testcase, print "Valid" if the syntax of the given pattern is correct.
 Otherwise, print "Invalid". Do not print the quotes.

Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output

Valid
Invalid
Invalid
 * 
 */


package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      String ok = "";
	       
	      while(testCases > 0){
	          testCases--;
	          ok = "yes";
	         String pattern = in.nextLine();
	          
	          try{
	               Pattern.compile(pattern);
	           }
	          catch(PatternSyntaxException e){
	              ok = "no";
	          }
	          if(ok.equals("yes")){
	              System.out.println("Valid");
	          }
	          else{
	              System.out.println("Invalid");
	          }
	                  
	      }
	}

}
