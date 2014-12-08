
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CountingTriangles1724 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
       for(int i=0;i<test;i++)
       {
           
        int n = sc.nextInt();
            int o = n*(n+2)*(2*n+1)/8;
            System.out.println(o);
        }
    }
    
}
