/*
 * Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

	Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

	This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

	Sample Input 1
	anagram
	margana
	
	Sample Output 1:
	Anagrams
 */


package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String A, String B) {
	      A = A.toLowerCase();
	      B = B.toLowerCase();
	       
	      char[] a = A.toCharArray();
	      char[] b = B.toCharArray(); 
	       
	      Arrays.sort(a);
	      Arrays.sort(b);
	       
	      return (Arrays.equals(a,b)); 
	   
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
}
