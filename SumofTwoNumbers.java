
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class SumofTwoNumbers 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long a,b;
        for(int i=0;i<test;i++)
        {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(a+b);
        }
    }
    
}
