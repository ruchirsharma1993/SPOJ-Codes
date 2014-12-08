/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class Compilersandparsers 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        read=read.trim();
        int test = Integer.parseInt(read);
        for(int i=0;i<test;i++)
        {
             String s  = in.readLine();
             int len = s.length();
             int max = 0, cl=0;
             for(int j=0;j<len;j++)
             {
                 String sub = s.substring(j,j+1);
                 if(sub.equals("<"))
                     cl++;
                 if(sub.equals(">"))
                 {
                     if(cl!=0)
                         cl--;
                     else
                         break;
                 }
                 if(cl==0)
                     max = j;
             }
             if(max!=0)
                 max++;
             System.out.println(max);
        }
    }
    
}
