
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class HOWMANYGAMES12448 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int min=0;
            double num =  sc.nextDouble();
            int d = (int) num;
            double val = num-d;
            if(val==0)
            {
                System.out.println("1");
                continue;
            }
            min=(int)(1/val);
            System.out.println(min);
        }
        
        }
    
}
