
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Checkthecoprimeness15555 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            long num = sc.nextLong();
            
            long n2 = (long) Math.floor(num/2);
           if(num==1)
                System.out.println(0);
           else if(num%2==0)
                System.out.println(n2-1);
            else
                System.out.println(n2);
                
        }
    }
    
}
