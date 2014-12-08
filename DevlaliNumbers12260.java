
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DevlaliNumbers12260
{
    public static void main(String args[])
    {
        int arrnum[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int count=0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int i=0;i<8760;i++)
            {
                if(a>arrnum[i])
                    continue;
                if(b<arrnum[i])
                    break;
                if((a<=arrnum[i])&&((b>=arrnum[i])))
                    count++;
                if(b<arrnum[i])
                    break;

            }
            System.out.println(count);
        }
    }
        /*
        int i=1;
        boolean arr[] = new boolean[100009];
        for(i=1;i<=100000;i++)
        {
            int num = calc(i);
            if((num<100000))
            {
                arr[num]=true;
                
            }
            else
                break;
           // System.out.println(num);
        }
        String s="";
        int count=0;
        for(i=1;i<=100000;i=i+2)
            if(arr[i])
            { 
                //System.out.println(i);
                if(isPrime(i))
                {
                    count++;
                    s=s+","+i;
                }
            }
        System.out.println("Count is"+count);
        System.out.println(s);
    }*/

   /* private static int calc(int i) 
    {
        int val=i;
        
        while(i>0)
        {
            val+=i%10;
            i=i/10;
        }
        return val;
    }

    private static boolean isPrime(int i) 
    {
        if(i%2==0)
            return false;
        for(double j=3;j<i;j=j+2)
            if(i%j==0)
                return false;
        return true;
    }
*/    
}
