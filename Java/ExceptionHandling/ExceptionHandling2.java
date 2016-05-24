package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {
	
	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}


class myCalculator {
    
    String power(int n, int p) throws Exception{
        
        String output;
        double a = (double) n;
        double b = (double) p;        
        
        if(a < 0 || b < 0){ 
            throw new Exception("n and p should be non-negative");
        }
        
        else{
            Double out1 =(Math.pow(a, b));
            Integer out2 = out1.intValue();
            output = String.valueOf(out2);
            return output;
        }   
    }   
}