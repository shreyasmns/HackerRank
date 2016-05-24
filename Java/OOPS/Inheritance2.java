/*
Write an Adder class that inherits from a superclass named Arithmetic in your editor
below. Then write an add method in the Adder class that takes  integers as a parameter
 and returns their sum.

Note: Because both classes are being written in the same file, you must not use access
 modifiers (e.g.: ) or your code will not execute.

Input Format
You are not responsible for reading any input from stdin; a hidden code checker will test your submission by calling the add method on an Adder object and passing it  integer parameters.

Output Format
You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Input
We will append a Solution class to your submitted code, which checks for inheritance and passes the necessary arguments to your add method:
*/

package oops;

class Arithmetic{}

class Adder extends Arithmetic{
    
    int add(int x, int y){
        int sum = x+y;
        return sum;
    }
    
}