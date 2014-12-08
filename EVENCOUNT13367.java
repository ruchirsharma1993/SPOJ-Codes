
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class EVENCOUNT13367 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count=0;
            for(int j=a;j<=b;j++)
            {
                String s = ""+j;
                if(s.contains("0")||s.contains("2")||s.contains("4")||s.contains("6")||s.contains("8"))
                    count++;
            }
            System.out.println(count);
        }
    }
    
}
