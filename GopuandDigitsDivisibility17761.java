
import java.io.IOException;
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
public class GopuandDigitsDivisibility17761 
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            BigInteger b = sc.nextBigInteger();
            String s = ""+b;
            int len = s.length();
            BigInteger sum =BigInteger.ZERO;
            
            for(int j=0;j<len;j++)
            {
                long temp = Long.parseLong(s.substring(j,j+1));
                BigInteger temp1 = BigInteger.valueOf(temp);
                sum = sum.add(temp1);
            }
           // System.out.println("Sum is"+sum);
            BigInteger z = BigInteger.ZERO;
            BigInteger o = BigInteger.ONE;
            
            if(b.mod(sum)==z)
                System.out.println(b);
        
            else
            {
                   while(b.mod(sum)!=z)
                       b=b.add(o);
                   System.out.println(b);
            }
        }
        
        
        
        
        
        /*java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = in.readLine();
        if(s.isEmpty())
                s=in.readLine();
        s=s.trim();
        int t = Integer.parseInt(s);
        
        for(int i=0;i<t;i++)
        {
            s = in.readLine();
            
      
            int len = s.length();
                long sum =0;
            
            for(int j=0;j<len;j++)
            {
                int temp = Integer.parseInt(s.substring(j,j+1));
                sum+=temp;
            }
            //System.out.println("Sum:"+sum);
            long num = Long.parseLong(s);
            if(num%sum==0)
                System.out.println(s);
            else
            {
                long d = num;
                while(d%sum!=0)
                    d++;
                
                System.out.println(d);
            }
        }*/
    }
    
}
