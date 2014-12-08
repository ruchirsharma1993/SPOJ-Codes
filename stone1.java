import java.util.StringTokenizer;
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Ruchir
 */
 class Solution
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read = read.trim();
        StringTokenizer st = new StringTokenizer(read);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        read = in.readLine();
        if(k==0)
            System.out.println(read);
        else
        {
        
        int max = Integer.MIN_VALUE;
        String next = "";
        st = new StringTokenizer(read);
        while(st.hasMoreElements())
        {
                int num = Integer.parseInt(st.nextToken());
                if(num>max)
                    max = num;
        }
        for(int i=0;i<k;i++)
        { 
            next="";
            int nextmax=Integer.MIN_VALUE;
            st = new StringTokenizer(read);
            while(st.hasMoreElements())
            {
                    int num = Integer.parseInt(st.nextToken());
                    int newnum = max - num;
                    if(newnum>nextmax)
                        nextmax = newnum;
                    next = next+""+newnum+" ";
            }
        
            read = next;
           
            max = nextmax;
            // Next Series
            // System.out.println(next);
        }
        next=next.trim();
        System.out.println(next);
        
        }
    }
    
}