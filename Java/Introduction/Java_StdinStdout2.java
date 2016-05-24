/*
 * Most of the problems on HackerRank require reading input from stdin (standard input) and writing output to stdout (standard output).

	One way to read from stdin is by using the Scanner class and specifying the InputStream as System.in. Alternatively, you can use the BufferedReader class.

	Lines of output can be written to stdout with the System.out.println function.

	For this exercise, you need to read inputs from stdin and print them to stdout.

	Input Format

	There are three lines of input. 
	Line one contains an integer. 
	Line two contains a double. 
	Line three contains a String.

	Output Format

	On the first line, print String: followed by the unaltered input String. 
	On the second line, print Double: followed by the unaltered input double. 
	On the third line, print Int: followed by the unaltered input integer.
	
	Note: If you use the nextLine() method immediately following the nextInt() method,
          recall that nextInt() reads integer tokens; because of this, the last newline 
          character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
 */

package introduction;

import java.util.Scanner;

public class Java_StdinStdout2 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         double y = sc.nextDouble();
         String s = sc.nextLine();
         s = sc.nextLine();

         System.out.println("String: "+s);
         System.out.println("Double: "+y);
         System.out.println("Int: "+x);
	}

}
