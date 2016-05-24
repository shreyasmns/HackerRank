/*
Input Format
The first line will have an integer n denoting the number of entries in the phone book.
 Each entry consists of two lines: a name and the corresponding phone number. 

After these, there will be some queries. Each query will contain a person's name. 
Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 
'first-name last-name' or in the format 'first-name'. Each phone number has exactly 
8 digits without any leading zeros.

1<=n<=100000
1<=query<=100000


Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output

uncle sam=99912222
Not found
harry=12299933
*/

package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	       
	      Map<String, Integer> phonebook = new HashMap<String, Integer>();
	       
	      for(int i=0;i<n;i++)
	      {
	         String key = in.nextLine();
	         int value = in.nextInt();
	         phonebook.put(key, value); 
	         in.nextLine();
	      }
	      
	      while(in.hasNext())
	      {
	         String ptr = in.nextLine(); 
	         if(phonebook.containsKey(ptr)){
	             System.out.println(ptr+"="+phonebook.get(ptr));
	         }
	          else{
	              System.out.println("Not found");
	          }
	      }
	}

}
