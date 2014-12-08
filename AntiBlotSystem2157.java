
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class AntiBlotSystem2157
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = br.readLine();
        while(s==null)
            s=br.readLine();
        s = s.trim();
        int t = Integer.parseInt(s);
        for(int i=0;i<t;i++)
        {
            s = br.readLine();
            while(s==null||s.isEmpty())
                s=br.readLine();
            
            StringTokenizer st = new StringTokenizer(s);
            String a = null,b = null,c = null;
            while(st.hasMoreElements())
            {
                
            
            a = st.nextToken();
            boolean flag=false;
           // System.out.println(a);
            
            
            b= st.nextToken();
            //System.out.println("b1"+b);
            b=st.nextToken();
           // System.out.println(b);
            c=st.nextToken();//System.out.println("c1"+c);
            c=st.nextToken();//System.out.println(c);
            
            if(c.contains("machula"))
            {
                int te = Integer.parseInt(a)+Integer.parseInt(b);
                c = ""+te;
            }
            else if(b.contains("machula"))
            {
                int temp = Integer.parseInt(c)- Integer.parseInt(a);
                b = ""+temp;
            }
            else if(a.contains("machula"))
            {
                int temp = Integer.parseInt(c)- Integer.parseInt(b);
                a = ""+temp;
            }
            }
            System.out.println(a+" + "+b+" = "+ c);
        }
    }
    
}
