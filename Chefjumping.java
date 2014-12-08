
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class Chefjumping 
{
    public static void main(String args[])
    {
        BigInteger b;
        Scanner sc = new Scanner(System.in);
        b = sc.nextBigInteger();
        BigInteger six = new BigInteger("6");
        BigInteger res = b.mod(six);
        BigInteger one = BigInteger.ONE;
        BigInteger three = new BigInteger("3");
        BigInteger zero = BigInteger.ZERO;
        if(res.equals(one)||res.equals(zero)||res.equals(three))
        {
            System.out.println("yes");
            
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
