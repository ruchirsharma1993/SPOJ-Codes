
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MinimumNumber16034 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        while(num!=-1)
        {
            long sum=0;
            sum=num/9;
            
            sum++;
            System.out.println(sum);
            num=sc.nextLong();
        }
    }
    
}
