/*
 * 
 * You are given an integer , you have to convert it into a string.

	Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 	can range between  -100 to 100  inclusive.
 */

package introduction;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = String.valueOf(n);
		System.out.println(s);
	}

}
