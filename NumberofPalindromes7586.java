/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NumberofPalindromes7586 
{
    public static void main(String args[])throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String input = in.readLine();
        while(input.isEmpty())
            input=in.readLine();
        input = input.trim();
        String word=input;
        int count=0;
            for (int from = 0; from < word.length(); from++) 
            {
                for (int to = from + 1; to <= word.length(); to++) 
                {
                    String sub = word.substring(from, to);
                    //System.out.println(sub);
                    if(sub.length()==1)
                        count++;
                    else
                    {
                        
                    StringBuilder rev = new StringBuilder(sub);
                    String rev1= rev.reverse().toString();
                    if(sub.equals(rev1))
                    {
                        //System.out.println("PAL");
                        count++;
                    }
                    }
                }
            }
            System.out.println(count);
            
    }
    
}
