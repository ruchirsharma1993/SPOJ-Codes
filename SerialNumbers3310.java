
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SerialNumbers3310 
{
    public static void main(String args[])throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = in.readLine();
        while(!s.equals("END"))
        {
            String name =in.readLine();
            String q = in.readLine();
            String output = "*"+q;
            while(!q.equals("0"))
            {
                StringTokenizer st = new StringTokenizer(q);
                int val1 = Integer.parseInt(st.nextToken());
                int val2 = Integer.parseInt(st.nextToken());
                String stat = st.nextToken();
                int t = Integer.parseInt(st.nextToken());
                
                String buffer = output;
                StringTokenizer st1 = new StringTokenizer(buffer,"*");
                
                
                
            }
        }
    }
    
}
