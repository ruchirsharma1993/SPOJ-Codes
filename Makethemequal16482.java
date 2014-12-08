
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Makethemequal16482
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            int sum=0;
            for(int j=0;j<n;j++)
            {
                int temp = sc.nextInt();
                arr[j]=temp;
                sum+=temp;
            }
            int avg = (int) Math.floor(sum/n);
            int cl=0,ch=0,ce=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<avg)
                    cl++;
                else if(arr[j]>avg)
                    ch++;
                if(arr[j]==avg)
                    ce++;
            }
            if(cl>ch)
                System.out.println(cl+ce);
            else
                System.out.println(ch+ce);
                
        }
    }
    
}
