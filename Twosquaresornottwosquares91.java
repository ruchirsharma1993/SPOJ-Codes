
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Twosquaresornottwosquares91
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long num;
        for(int i=0;i<test;i++)
        {
            num = sc.nextLong();
            
            if((num==1)||(num==2))
            {
                System.out.println("YES");
                continue;
            }
           if(num==0)
           {
               System.out.println("NO");
           }
            else if(Math.round(Math.sqrt(num))==Math.sqrt(num))
            {
                System.out.println("YES");
                continue;
            }
//            int val = check(num);
            
            if(check(num))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }

    static boolean check(long num) 
    {
        long test = num;
        for(long i=1;i<num;i++)
        {
          test=test-(i*i);
          if(test<0)
              return false;
          System.out.println("Test: "+test);
          if(Math.round(Math.sqrt(test))==Math.sqrt(test))
          {
                return true;
          }  
          test=num;
        }
       
        
            return false;
    }
    
}
