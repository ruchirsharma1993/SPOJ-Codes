
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FlowersFlourishfromFrance7757
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String input = in.readLine();
        while(input.isEmpty())
            input=in.readLine();
        input = input.trim();
        while(!input.equals("*"))
        {
            StringTokenizer st = new StringTokenizer(input);
            String start = st.nextToken();
            String check = start.substring(0,1);
            boolean flag=true;
            while(st.hasMoreElements())
            {
                String stt=st.nextToken().substring(0, 1);
                //System.out.println(stt);
                
                if(stt.equalsIgnoreCase(check))
                {}
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("Y");
            else
                System.out.println("N");
            
            // Next Input
            input = in.readLine();
            while(input.isEmpty())
                input=in.readLine();
            input = input.trim();

            
        }
    }
    
}
