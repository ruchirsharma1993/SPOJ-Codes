
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
public class Interestingnumber279
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int num = sc.nextInt();
            if(num==1)
            {
                System.out.println("1");
                continue;
            }
            String snum = ""+num;
            //int scheck = check(snum);
            BigInteger b = new BigInteger(snum);
            BigInteger j = new BigInteger("1");
            
            while(true)
            {
                BigInteger b1=b.multiply(j);
                j=j.add(BigInteger.ONE);
                String sb=""+b1;
                System.out.println(b1+" : "+j);
                if(check(sb)==num)
                {
                    System.out.println(sb);
                    break;
                }
            }
            
        }
    }

    private static int check(String n) 
    {
        int len = n.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
            String sub = n.substring(i,i+1);
            int num = Integer.parseInt(sub);
            sum+=num;
        }
        return sum;
    }
    
}
