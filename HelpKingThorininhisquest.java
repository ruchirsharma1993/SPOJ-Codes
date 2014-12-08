/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class HelpKingThorininhisquest 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        if(read.isEmpty())
            read=in.readLine();
        read = read.trim();
        int arr[] = new int[50];
        int len= read.length();
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        
        for(int i=0;i<len;i++)
        {
            char c = read.charAt(i);
           // System.out.println("char is"+c);
            for(int j=0;j<alpha.length();j++)
            {
                char check = alpha.charAt(j);
                if(c==check)
                {
                    //System.out.println("Matched !!"+check);
                    arr[j]++;
                    break;
                }
            }
        }
        
        boolean flag=true;
        //Checking
        for(int i=0;i<28;i++)
        {
            if(arr[i]%2!=0)
            {
                //System.out.println("Problem for"+arr[i]+": "+alpha.charAt(i));
                if(flag)
                    flag=false;
                else
                {
                    System.out.println("NO");
                    break;
                }
            }
            
                    
                    
        }
           if(flag)
        System.out.println("YES");
    }
    
}
