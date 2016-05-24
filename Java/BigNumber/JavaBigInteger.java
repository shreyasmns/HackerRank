/*
Input Format
There will be two lines containing two numbers, a and b.

Constraints
a and b are non-negative integers and can have maximum 200 digits.

Output Format
Output two lines. The first line should contain a+b, and 
the second line should contain a*b. Don't print any leading zeros.

Sample Input
1234
20

Sample Output
1254
24680
 */
package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	        BigInteger a = sc.nextBigInteger();
	        sc.nextLine();
	        BigInteger b = sc.nextBigInteger();
	        
	        BigInteger sum =  a.add(b);
	        BigInteger product = a.multiply(b);
	        
	        System.out.println(sum);
	        System.out.println(product);
	}

}
