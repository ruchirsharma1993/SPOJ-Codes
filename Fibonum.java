
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class Fibonum 
{
    static boolean isFibonacci(int n)
{
    
    return isPerfectSquare(5*n*n + 4) ||
           isPerfectSquare(5*n*n - 4);
}
    static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test  = sc.nextInt();
        
        for(int i=0;i<test;i++)
        {
            int num = sc.nextInt();
            if(isFibonacci(num))
                System.out.print("Yes");
            else
                System.out.print("No");
            
        }
    }
    
}
