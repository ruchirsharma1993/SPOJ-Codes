
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class codejam1 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read = read.trim();
        int test = Integer.parseInt(read);
        
        for(int i=0;i<test;i++)
        {
            //Reading Arrangement One
            String n = in.readLine();
            while(n.isEmpty())
                n = in.readLine();
            n = n.trim();
            int n1 = Integer.parseInt(n);
            String s1="";
            for(int j=0;j<4;j++)
            {
                String r = in.readLine();
                if(j==n1-1)
                    s1 = r;
            }
            
            //Reading Arrangmenet Two
            n = in.readLine();
            while(n.isEmpty())
                n = in.readLine();
            n = n.trim();
            int n2 = Integer.parseInt(n);
            String s2="";
            for(int j=0;j<4;j++)
            {
                String r = in.readLine();
                if(j==n2-1)
                    s2 = r;
            }
            
            boolean flagf = false,flag=true;
            String out="";
            StringTokenizer st = new StringTokenizer(s1);
            while(st.hasMoreElements())
            {
                String next = st.nextToken();
                if(s2.contains(next))
                {
                    if(flagf)
                    {
                        flag=false;
                        System.out.println("Case #"+(i+1)+": Bad magician!");
                        break;
                    }
                    out = next;
                    flagf=true;
                    //System.out.println(s2);
                }
            
            }
            if(flagf&&flag)
                System.out.println("Case #"+(i+1)+": "+out);
            else if(flag)
                System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
        }
    }
    
}
