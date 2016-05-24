/*
You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three topmost hourglasses are
the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses 
above are 7, 4, and 2, respectively.
In this problem, you have to print the largest sum among all the hourglasses in the array.

Note: If you have already solved the problem "Java 2D array" in the data structures chapter
of the Java domain, you may skip this challenge.

Input Format
There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

Output Format
Print the answer to this problem on a single line.
*/

package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int output;
        int max = -1000;
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        for(int j=0; j< 4; j++){
            for(int k=0; k< 4; k++){
                output = sum(arr, j, k);
                max = max > output ? max : output;
            }
        }
        System.out.println(max);
    }
    
    public static int sum(int[][] a, int j, int k){
        int sumr = a[j][k]+a[j][k+1]+a[j][k+2]+a[j+1][k+1]+a[j+2][k]+a[j+2][k+1]+a[j+2][k+2];
             return sumr;
      }
}
