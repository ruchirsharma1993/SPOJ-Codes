
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
public class BeautifulnumbersEXTREME8177 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int q=0;q<test;q++)
        {
        BigInteger a=sc.nextBigInteger() ;
        BigInteger b =sc.nextBigInteger();
        boolean f =true,l=false;
        String s;
       // for(int i=10;i<100;i++)
        BigInteger i =a;
        int c=0;
        while(!l)
        {
           if(f)
           {
               f=false;
           }
           else
           {
               i=i.add(BigInteger.ONE);
           }
           
           if(i.equals(b))
                l=true;
           
            a=i;
            s=""+i;
            BigInteger val; 
            BigInteger n;
            if(s.contains("2"))
            {    
                n = new BigInteger("2");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }
            if(s.contains("3"))
            {    
                 n = new BigInteger("3");
                val = a.mod(n);
            if(val.intValue()!=0)
                {
                    continue;
                }}   
            if(s.contains("4"))
            {    
                n = new BigInteger("4");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }   
            if(s.contains("5"))
            {    
                n = new BigInteger("5");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }   
            if(s.contains("6"))
            {    
                 n = new BigInteger("6");
                val = a.mod(n);
            if(val.intValue()!=0)
                {
                    continue;
                }
            }   
            if(s.contains("7"))
            {    
                n = new BigInteger("7");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }   
            if(s.contains("8"))
            {    
                 n = new BigInteger("8");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }   
            if(s.contains("9"))
            {    
                n = new BigInteger("9");
                val = a.mod(n);
                if(val.intValue()!=0)
                {
                    continue;
                }
            }   
        //System.out.println(a);    
        c++;
        }
        System.out.println(c);
        }
    }
    
}
