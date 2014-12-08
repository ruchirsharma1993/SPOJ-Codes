
import java.util.regex.Matcher;
import java.util.regex.Pattern;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class TooManyRepetitions 
{
  public static int countSubstrings( String text, String search, boolean countOverlap ) {
int inc = countOverlap ? 1 : search.length() ;
int count = 0 ;
for ( int i = -inc ; ( i = text.indexOf( search, i + inc ) ) != -1 ; count ++ ) {
}
return count ;
}
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int test = Integer.parseInt(in.readLine());
        for(int i=0;i<test;i++)
        {
            String s = in.readLine();
            while(s.isEmpty())
            {
                s=in.readLine();
            }
            s = s.trim();

            int num = Integer.parseInt(in.readLine());
            for(int j=0;j<num;j++)
            {
                String read = in.readLine();
               /* int occurrences = countOccurrences(s, read);
                System.out.println(occurrences);*/
               int count = 0;
               
               int len = s.length();
               int len1 = read.length();
               for(int l=0;l<=len-len1;l++)
               {
                   String sub = s.substring(l,l+len1);
                   //System.out.println("Substring is: "+sub);
                   if(sub.equals(read))
                       count++;
               }
                System.out.println(count);
            }
        }
    }
    
}
