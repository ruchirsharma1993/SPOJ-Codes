
import java.io.IOException;
import java.math.BigInteger;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Bishops328 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String s = in.readLine();
        
      
       while(!s.isEmpty())
       {
           BigInteger b = new BigInteger(s);
           if(b.equals(BigInteger.ONE))
               System.out.println(1);
           else if(b.equals(BigInteger.ZERO))
               System.out.println(0);
           else
           {
           
               BigInteger res = new BigInteger("2");
               b=b.subtract(BigInteger.ONE);
               res=res.multiply(b);
               System.out.println(res);

           }
           s=in.readLine();
           if(s==null)
               break;
       }
    
    }
    
    
}
