/*
 * Given a string, find out the lexicographically smallest and largest substring of length k.

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 
2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print
the lexicographically maximum substring.
 */

package strings;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String inputString = sc.next();
	        sc.nextLine();
	        int length = sc.nextInt();
	        
	        String next="", lexmin="", lexmax = "";
	   
	        for(int i=0; i< inputString.length()-(length-1); i++){
	            next = inputString.substring(i, i+length);
	            if(i==0){
	                lexmin = next;
	            }
	            else if(next.compareTo(lexmin) <= 0){
	                lexmin = next;
	            } 
	            
	            
	            if(lexmax.compareTo(next) > 0){
	                lexmax = lexmax;
	            }
	            else{
	                lexmax = next;
	            }
	        }     
	        System.out.println(lexmin);
	        System.out.println(lexmax);
	}

}
