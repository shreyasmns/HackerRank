/*
 * Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of  and .
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

Two strings, the first being A and the second being B. They are comprised of lowercase
English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a 
single line, separated by a space.
 * 
 */

package strings;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        
	        int length = A.length() + B.length();
	        System.out.println(length);
	        
	        if((A.compareTo(B) < 0) || (A.compareTo(B)==0)){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	        
	        A = A.substring(0,1).toUpperCase() + A.substring(1);
	        B = B.substring(0,1).toUpperCase() + B.substring(1);
	        
	        System.out.println(A+" "+B);
	}

}
