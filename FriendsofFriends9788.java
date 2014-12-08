
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
public class FriendsofFriends9788 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read=read.trim();
        int test = Integer.parseInt(read);
        String s="";
        int num=0;
        String frnd="";
        for(int i=0;i<test;i++)
        {
            String next = in.readLine();
            while(next.isEmpty())
                next=in.readLine();
            
           // System.out.println("Read"+next);
            next = next.trim();
            StringTokenizer st = new StringTokenizer(next);
            String stemp = null;
            if(st.hasMoreElements())
                stemp=st.nextToken();
           frnd=frnd+","+stemp;
           if(s.contains(stemp))
           { 
               s=s.replace(stemp, "");
               //System.out.println("Friend Added and S Replaced:"+s);
           }    
            //System.out.println("Friends are"+frnd);
            int nof = Integer.parseInt(st.nextToken());
            for(int j=0;j<nof;j++)
            {
                String str = st.nextToken();
                str=","+str+",";
                if(frnd.contains(str))
                {//Do Nothing
                    num--;
                    s=s.replace(str, "");
                    //System.out.println("S Replaced:"+s);
                }
                 else if(s.contains(str))
                 {
                     // Do Nothing
                 }
                else
                 {
                     s = s+str;
                     num++;
                     //System.out.println("String is"+s);
                 }
            
            }
            
        }
        System.out.println(num);
            
            
            
        
    }
    
}
    

