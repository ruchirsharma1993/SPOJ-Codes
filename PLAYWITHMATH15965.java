
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PLAYWITHMATH15965 
{
  static int gcd(int p, int q)
  {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b)
            {
                System.out.println("1 1");
                continue;
            }
            if((a==0)||(b==0))
            {
                System.out.println("0 0");
                continue;
                
            }
            int gcd = gcd(a,b);
            int ag = a/gcd;
            int bg = b/gcd;
            System.out.println(bg+" "+ag);
            
        }
        
        
    }
    
}
