
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TheIndianConnection11402 
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
      for(int l=0;l<test;l++)
      {
          String thue   = "M";
          String morse  = "F";
          String t, m;

          int n = sc.nextInt();
            int k = sc.nextInt();
            if(n==1)
                System.out.println("Male");
            else
            {
                for(int i=1;i<=n;i++)
                {
                    t = thue;                     // save away values
                 m = morse;
                 thue  += m;
                 morse += t;

                }
            
            //System.out.println(thue);
            String sub="";
            if(k!=0)
                sub = thue.substring(k-1);
            
            if(sub.startsWith("M"))
                System.out.println("Male");
            if(sub.startsWith("F"))
                System.out.println("Female");
            }
         }
    }
    
}
