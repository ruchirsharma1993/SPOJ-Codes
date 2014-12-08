
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Nicenessofthestring15554 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String stest = in.readLine();
        /*while(stest==null)
            stest=in.readLine();
        
         */
        int test = Integer.parseInt(stest);
        for(int i=0;i<test;i++)
        {
            String input = in.readLine();

            /*while(input==null)
                input=in.readLine();
            */
            input = input.trim();
            StringTokenizer st = new StringTokenizer(input);
            String sub="";
            int count=0;
            while(st.hasMoreTokens())
            {
                String next = ","+st.nextToken()+",";
                if(sub.contains(next))
                {
                    // Do Nothing
                }
                else
                {    
                    sub=sub+","+next;
                    count++;
                }
            }
    
            System.out.println(count);
        }
    }
    
}
