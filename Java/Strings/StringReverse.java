/*
 * Given a string A, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

	Some examples of palindromes are "madam", "anna", "reviver".

	Sample Input
	madam

	Sample Output
	Yes
 */

package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();

	        StringBuilder sb = new StringBuilder();
	        sb.append(A);
	        sb = sb.reverse();
	        String sb2 = sb.toString();
	        
	        if(A.equals(sb2)){
	            System.out.println("Yes");
	        }
	           else{
	             System.out.println("No");  
	           }
	}

}
