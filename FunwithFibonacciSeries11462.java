
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FunwithFibonacciSeries11462 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        for(long i=0;i<test;i++)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            
            if(n.equals("2"))
            {   
                BigInteger res = a.add(b);
                res=res.mod(m);
                System.out.println(res);
                continue;
            }
            BigInteger nc = new BigInteger("2");
            //long sum = a;
            BigInteger sum =a;
            //while(nc<=n)
            while(nc.compareTo(n)<=0)
            {
                sum=sum.add(b);
                //long temp=b;
                BigInteger temp =b;
                //b=a+b;
                b = a.add(b);
                a=temp;
                
                //System.out.println("Value of sum for nc="+nc+": "+sum);
                nc = nc.add(BigInteger.ONE); 
                
                
                //nc++;
            }
            BigInteger res= sum.mod(m);
                System.out.println(res);    
           // System.out.println((sum)%m);
            
        }
    }
    
}
