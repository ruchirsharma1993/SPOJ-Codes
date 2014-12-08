
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CheckthestringPowers15563 
{
    static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
    
    static int lcm(int a, int b)
    {
    
         return a * (b / GCD(a, b));

    }
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
	String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read=read.trim();
        
        int test = Integer.parseInt(read);
        for(int i=0;i<test;i++)
        {
            read = in.readLine();
            StringTokenizer st = new StringTokenizer(read);
            String a = st.nextToken();
            String b = st.nextToken();
            
            int la = a.length();
            int lb = b.length();
            if(la==lb)
            {
                if(a.equals(b))
                    System.out.println("YES");
                else
                    System.out.println("NO");
                        
                continue;
            }
            if(la>lb)
            {
                if(!a.startsWith(b))
                {
                     System.out.println("NO");
                     continue;
                }
            }
            if(lb>la)
            {
                if(!b.startsWith(a))
                {
                     System.out.println("NO");
                     continue;
                }
            }
            
            int gcd = lcm(la,lb);
            //System.out.println("la is: "+la+" lb is: "+lb+"lcm is: "+gcd);
                while(la<gcd)
                {
                    a=a+a;
                    la=la+la;
                }
            
                while(lb<gcd)
                {
                    b=b+b;
                    lb=lb+lb;
                }
            if(la==lb)
            {
                if(a.equals(b))
                    System.out.println("YES");
                
            }
            else
                System.out.println("NO");
            
                
        }
    }
    
}
