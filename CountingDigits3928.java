
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CountingDigits3928 
{
    public static void main(String args[])throws Exception
  {
  
      Scanner sc = new Scanner(System.in);
      boolean flag=true;
      while(flag)
      {
          int a = sc.nextInt();
          int b = sc.nextInt();
      
          if((a==0)&&(b==0))
          {
              flag=false;
              break;
          }
          int count[] = new int[10];
          for(int i=a;i<=b;i++)
          {
          
            String s = ""+i;
            for(int j=0;j<=9;j++)
            {
              Pattern p = Pattern.compile(s);
              String str = ""+j; 
              Matcher m = p.matcher(str);
              //count[j] = 0;
              while (m.find())
              {
                    count[j] +=1;
              }
             
            }
            for(int j=0;j<=9;j++)
            {
                System.out.print(count[j]);
            }
            System.out.println();
          }

      }
  }
    
    
}
