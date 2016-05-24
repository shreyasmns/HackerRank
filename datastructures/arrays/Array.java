/*
Input Format

The first line contains an integer, N(the number of integers in A). 
The second line contains N space-separated integers describing A.

Constraints
1 <= N <= 1000
1 <= Ai <= 10000

Output Format
Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input
4
1 4 3 2

Sample Output
2 3 4 1
*/

package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int i=n-1; i >= 0; i--){
	            arr[i] = in.nextInt();
	        }
	        
	        for(int i=0; i< arr.length; i++){
	            System.out.print(arr[i]+" ");
	        }
	}

}
