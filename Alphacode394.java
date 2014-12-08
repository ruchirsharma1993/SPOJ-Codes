
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Alphacode394 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String s = in.readLine();
        while(s.isEmpty())
            s=in.readLine();
        s=s.trim();
        while(!s.equals("0"))
        {
            check(s);
            s= in.readLine();
            s=s.trim();
            System.out.println(count);
            count=0;    
            if(s.equals("0"))
            {
                break;
            }
        }
    }

    static long count = 0;
    private static void check(String s) 
    {
        //System.out.println("Checking the string"+s);
        
        String sub="0";
        boolean flagsub = false;
        boolean flagsub1 = false;
        String sub1 ="0"; 
        boolean inc = false;
        int s1,s2;
        
        s1=Integer.parseInt(sub);
        s2=Integer.parseInt(sub1);
        
        if(s.length()>1)
        {
            flagsub = true;
            sub = s.substring(0,1);
            s1=Integer.parseInt(sub);
        
        }
               
        else if(!s.equals("0")&&(!s.startsWith("0"))&&(Integer.parseInt(s)<=26)&&(Integer.parseInt(s)>0))
        {
            count++;
            inc  =true;
           // System.out.println("Count incremented for"+s);
        }
        
        if(s.length()>2)
        {
            flagsub1=true;
            sub1=s.substring(0,2);
            s2=Integer.parseInt(sub1);
        
        }
        else if((!inc)&&(!s.equals("0")&&(!s.startsWith("0"))&&(Integer.parseInt(s)<=26)&&(Integer.parseInt(s)>0)))
        {
            count++;
            //System.out.println("Count incremented for"+s);
        }
        
        if((s1<=26)&&(s1>0)&&(flagsub))
        {
           // System.out.println("IF 1");
           // System.out.println("Check for:"+s.substring(1)+"and Discarded: "+s.substring(0,1));
            check(s.substring(1));
        }
        
        if((s2<=26)&&(s1>0)&&(flagsub1))
        {
           // System.out.println("IF 2");
           // System.out.println("Check for:"+s.substring(2)+"and Discarded: "+s.substring(0,2));
            
            check(s.substring(2));
        
        }
        
        
        
        
        //return count;
    }
    
}
