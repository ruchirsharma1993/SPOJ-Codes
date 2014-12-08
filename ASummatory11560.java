
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
public class ASummatory11560 
{
    public static void main(String args[])
    {
  
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            
               BigInteger a = sc.nextBigInteger();
               BigInteger totsum = BigInteger.ZERO; 
           
              BigInteger val = BigInteger.ONE;
              for(BigInteger b =a;b.compareTo(BigInteger.ZERO)>0;b=b.subtract(BigInteger.ONE))
              {
                 BigInteger num = b;
                 val = val.multiply(num); //n
                 num=num.add(BigInteger.ONE);
                 val=val.multiply(num);//n+1

                 BigInteger div = new BigInteger("2");
                 val=val.divide(div); //n*n+1)/2

                 val=val.multiply(val); //Squared
                 totsum = totsum.add(val);
                 val = BigInteger.ONE;

              } 
            
              BigInteger mod = new BigInteger("1000000003");
              totsum=totsum.mod(mod);
            
            System.out.println(totsum);
            
        }    
    }
    
}
