
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
public class Valences15438 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
	String read = in.readLine();
        while(read.isEmpty())
                read=in.readLine();
            read=read.trim();
        while(!read.equals("0"))
        {
            StringTokenizer st = new StringTokenizer(read);
            int test = Integer.parseInt(st.nextToken());
            int pow=0,count=0;
            if(test==1)
            {
                System.out.println(st.nextToken());
                     read=in.readLine();
                if(read.equals("0"))
                    break;
                while(read.isEmpty())
                    read=in.readLine();

                read=read.trim();
                continue;
            }
            
            int temp;
            int lpow=pow;
            temp = (int)Math.pow(2, count); 
            while(pow<test)
            {
                lpow=pow;
                pow+=temp;
                count++;
                temp = (int)Math.pow(2, count); 
                if(pow>=test)
                {
                    pow=lpow;
                    break;
                }
            }
            //System.out.println("Pow: "+pow);
            for(int i=0;i<pow;i++)
            {
                int num = Integer.parseInt(st.nextToken());
                
            }
            int out=0;
            for(int i=0;i<test-pow;i++)
                out=out+Integer.parseInt(st.nextToken());
            System.out.println(out);
                  read=in.readLine();
                if(read.equals("0"))
                    break;
                while(read.isEmpty())
                    read=in.readLine();

                read=read.trim();
                continue;
            
           /* while(pow<test)
            {
                count=count+pow;
                if(count>=test)
                    break;
                pow=(int) Math.pow(2, count);
            }
            //count--;
            System.out.println("Counting: "+count);
            boolean flag = false;
            int out=0;
            int tr = count;
            System.out.println("tr is:  "+tr);
            
            for(int i=1;i<=test;i++)
            {
                int num = Integer.parseInt(st.nextToken());
                System.out.println(num);
                if(flag)
                {
                    out=out+num;
                }
                else if(count==0)
                {   
                    flag=true;
                    out=out+num;
                   System.out.println("Accepting now");
                }
                else
                    count--;
                
            }
            System.out.println(out);
            read=in.readLine();
            if(read.equals("0"))
                break;
            while(read.isEmpty())
                read=in.readLine();
            
            read=read.trim();

        }*/
    
        }
    

    }
}
