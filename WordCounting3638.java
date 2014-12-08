
import java.io.IOException;
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
public class WordCounting3638 
{
    public static void main(String args[]) throws IOException
    {
       java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String stest = in.readLine();
       while(stest==null)
            stest=in.readLine();
        
         
        int test = Integer.parseInt(stest);
        for(int i=0;i<test;i++)
        {
            String input = in.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int max=0;
            int buffer=0;
            int lastlen = 0;
            lastlen = st.nextToken().length();
            buffer=1;
            while(st.hasMoreElements())
            {
                String next = st.nextToken();
                int len = next.length();
               // System.out.println("Next is"+next);
               // System.out.println("Length is: "+len);
                if(lastlen==len)
                {
                    buffer++;
                   // System.out.println("Length is equal !!"+buffer);
                }
                else if(buffer>max)
                {
                    
                    max=buffer;
                   // System.out.println("Length not equal");
                    buffer=1;
                }
                lastlen=len ;
                
                
            }
            if(buffer>max)
                    max=buffer;
                
            System.out.println(max);
        }
    }
    
}
