
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
public class QuadraticEquation8398 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        int num = Integer.parseInt(read);
        for(int i=0;i<num;i++)
        {
            read = in.readLine();
            while(read.isEmpty())
                read=in.readLine();
       
            String a=null,next;
            int index = read.indexOf("x*x");
            if(read.startsWith("x*x"))
                a="1";
            else
                a=read.substring(0, index-1);
            next = read.substring(index+3);
            
          //  System.out.println(next);
           // System.out.println("a=:"+a);
            
            String b=null;
             index = read.indexOf("*x");
            
            if(next.startsWith("x"))
                b="1";
            else
                b=next.substring(0, index+1);
            next = next.substring(index+3);
           // System.out.println("Next is: "+next);
          //  System.out.println("b=:"+b);
           
            StringTokenizer st = new StringTokenizer(next,"=");
            String c = st.nextToken();
          //  String d = st.nextToken();
            
            double ai,bi,ci,di,det;
            ai = Integer.parseInt(a);
            bi = Integer.parseInt(b);
            ci = Integer.parseInt(c);
         //   di = Integer.parseInt(d);
            
            //Calculating DET
            //Equal roots." ,"Imaginary roots." or "Distinct real roots."
            det = Math.sqrt((bi*bi)-(4*ai*ci));
            if(det<0)
                System.out.println("Imaginary roots.");
            if(det==0)
                System.out.println("Equal roots.");
            else
                System.out.println("Distinct real roots.");
        }
    }
    
}
