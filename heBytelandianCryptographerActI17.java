
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Timestamp;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class heBytelandianCryptographerActI17 
{
    public static BigDecimal sqrt(BigDecimal value) 
    {
    BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
    return x.add(new BigDecimal(value.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));

    }
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = in.readLine();
        while(s.isEmpty())
            s=in.readLine();
        s=s.trim();
        BigDecimal num = new BigDecimal(s);
        BigDecimal mul = new BigDecimal("4000000007");
        num=num.multiply(mul);
        BigDecimal val = sqrt(num);
        String vals=""+val;
        java.util.Date d = new java.util.Date(s);
        System.out.println(d);
    }
    
}
