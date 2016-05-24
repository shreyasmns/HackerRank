/*
 * Input Format

	The first line will contain the number of testcases t.
    Each of the next  lines will have three integers, , , and .

	Constraints:

	0<=t<=500
	0<=a,b<=50
	1<=n<=15

	Output Format

	Print the answer to each test case in separate lines.
 */

package introduction;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
int a=0, b=0, n=0, var=0;
        
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        if(t > 0 && t <=500){
          for(int k=0; k<t; k++){  
           a = sc.nextInt();
           b = sc.nextInt();
           n = sc.nextInt();
            
           var = a;
           
           if((a>=0 && a <=50) && (b >=0 && b<=50) && (n>=1 && n <=15)){
               for(int j=0; j< n; j++){
                    var +=  (int) (Math.pow(2,j) * b);  
                    System.out.printf("%d ",var);
              }
              System.out.println();
           }
        }
        }
	}

}
