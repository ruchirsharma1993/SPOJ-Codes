
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DistinctSubstrings694 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String input = in.readLine();
        while(input==null)
            input=in.readLine();
        input=input.trim();
        int test = Integer.parseInt(input);
        for(int i=0;i<test;i++)
        {
            String word=in.readLine();
            String substr=",";
            int count=0;
            for (int from = 0; from < word.length(); from++) 
            {
                for (int to = from + 1; to <= word.length(); to++) 
                {
                    String sub = word.substring(from, to);
                    sub=","+sub;
                    //System.out.println(sub);
                    if(substr.contains(sub))
                    {
                        // Do Nothing
                    }
                    else
                    {
                        substr=substr+","+sub;
                        count++;
                    }
                    
                    
                }
            }
            System.out.println(count);
        }
        
        
        
        
        
        
        
           
    }
    
}
