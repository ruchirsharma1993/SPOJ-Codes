
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Database11374
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int r = sc.nextInt();
            String s[] = new String[n+1];
            for(int k=0;k<=n;k++)
            {
                s[k]="";
            }
            boolean flag=true;
                
            for(int j=0;j<r;j++)
            {
                int student =sc.nextInt();
                int sub = sc.nextInt();
               // System.out.println("student is "+student);
               // System.out.println("sub is"+sub);
                String ssub=""+sub;
                String chck = s[student];
                //System.out.println("chck is"+chck);
                
                if(chck.isEmpty())
                {
                    chck = sub + ",";
                    //.out.println("In if, check is" +chck);
                    s[student]=chck;
                }
                else if(chck.contains(ssub))
                {
                        //System.out.println("in if");
                        flag=false;
                        break;
                }
                
                else
                {   
                   // System.out.println("in else");
                    s[student]=chck+","+ssub;
                    
                }
            }
            if(!flag)
                System.out.println("Scenario #"+(i+1)+": impossible");
            else
                System.out.println("Scenario #"+(i+1)+": possible");
            
        }
    }
    
}
