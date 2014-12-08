
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class EulerTotientFunction4141 
{
    static int fi(int n) 
     { 
       int result = n; 
       for(int i=2;i*i <= n;i++) 
       { 
         if (n % i == 0) result -= result / i; 
         while (n % i == 0) n /= i; 
       } 
       if (n > 1) result -= result / n; 
       return result; 
     } 
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =0;i<test;i++)
        {
            int num = sc.nextInt();
            int res = fi(num);
            System.out.println(res);
        }
    }
    
}
