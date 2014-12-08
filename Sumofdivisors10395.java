/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Sumofdivisors10395
{
    public static void main(String args[])
    {
        for(double i=0;i<1000000;i++)
        {
            double sum=0;
            for(double j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                    sum+=j;
            }
            sum+=i;
            if(isPrime(sum))
            {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(double sum) 
    {
        if(sum%2==0)
            return false;
        for(int i=3;i<Math.sqrt(sum);i=i+2)
            if(sum%i==0)
                return false;
        return true;
    }
    
}
