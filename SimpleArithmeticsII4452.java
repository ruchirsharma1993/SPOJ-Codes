
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SimpleArithmeticsII4452 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read=read.trim();
        int test = Integer.parseInt(read);
        
        for(int i=0;i<test;i++)
        {
            boolean first = true;
            read = in.readLine();
            while(read.isEmpty())
                read=in.readLine();
            read=read.trim();
            
            // String Read, Processing from here:
            StringTokenizer st = new StringTokenizer(read);
           String next="";
           long a = 0,b,res = 1;
           String op=""; 
           while(!next.equalsIgnoreCase("="))
            {
                next  = st.nextToken();
                //System.out.println("Next is"+next);
                if(next.equals("="))
                {
                    //System.out.println("Breaking");
                
                    break;
                }
                if(first)
                {
                    a = Long.parseLong(next);
                    first = false;
                    res=a;
                    op = st.nextToken();
                    if(op.equals("=")){
                       res=a;
                       //System.out.println(a);
                   // System.out.println("op is: "+op);
                    break;
                    }
                }
                else
                {
                    op=next;
                    //System.out.println("Op is: "+op);
                
                }
                next  = st.nextToken();
               //System.out.println("Reading b"+next);
                if(next.equals("="))
                    break;
                
                b = Long.parseLong(next);
                if(op.equalsIgnoreCase("+"))
                    res = res+b;
                if(op.equalsIgnoreCase("-"))
                    res = res-b;
                if(op.equalsIgnoreCase("*"))
                    res = res*b;
                if(op.equalsIgnoreCase("/"))
                    res = (long) Math.floor(res/b);
            
                
            }
            System.out.println(res);
        }
    }
    
}
