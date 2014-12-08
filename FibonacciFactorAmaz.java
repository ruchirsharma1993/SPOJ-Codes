
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class FibonacciFactorAmaz 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long arr[] = {1,3,5,13,21,55,89,233,377,987,1597,4181,6765,17711,28657,75025,121393,317811,514229,1346269,2178309,5702887,9227465,24157817,39088169,102334155,165580141,433494437,701408733,1836311903};
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int k = sc.nextInt();
            int f,d;
            if(k%2==0)
            {
                f=2;
                d=2;
                
            }
            else if(k%3==0)
            {
                f=d=3;
            }
            else if(k%5==0)
            {
                f=d=5;
            }
            else if(k%7==0)
            {
                f=7;
                d=21;
            }
            else if(k%11==0)
            {
                
            }
        }
        
        /*long a=0,b=1;
        long c = a+b;
        long count=2;
        String s="";
        while(count<100)
        {
            if(c%2!=0)
            {
                s= s + c+",";
                System.out.println(count+": "+c);
            }
            if(c<0)
                break;
            a=b;
            b=c;
            
            c=a+b;
            count++;
        }
        System.out.println(s);
    */
        
        
          }
    
}
