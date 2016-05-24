/*
You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if  a=c and b=d.
That also implies (a,b) is not same as(b,a). 

After taking each pair as input, you need to print number of unique pairs you currently have.

Note: Brute force solution will not earn full points.

Hints: Solve Java Comparator problem first!

Input Format

In the first line, there will be an integer  denoting number of pairs. Each of the next T lines will contain two strings seperated by a single space.

Constraints:
1<= T<= 100000

Length of each string is atmost 5 and will consist lower case letters only.
The testcases were generated randomly.

Output Format
Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
*/

package dataStructure;

import java.util.Scanner;

public class HashSet {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine();
	        
	        HashSet<String> set = new HashSet<String>();
	        
	        while(sc.hasNext()){
	            String in = sc.nextLine();
	            
	            set.add(in);
	            System.out.println(set.size());
        }
	}
}
