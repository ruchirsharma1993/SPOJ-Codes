
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class JavavsC1163 
{
    
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String read = in.readLine();
       read=read.trim();
        while(read!=null)
        {
            boolean cpp=false,java=false;
            if(read.contains("_"))
                cpp=true;
            else
                java=true;
            String out="";
            
            if((!cpp)&&(!java))
                    out=read;
            else if(cpp)
            {
                int len = read.length();
                boolean flag=false;
                for(int i=0;i<len;i++)
                {
                    char c = read.charAt(i);
                    if((c>=65)&&(c<=90))
                    {   //Error
                        out="Error!";
                        break;
                        
                    }
                    if((c=='_'))
                    {
                        out=out+"";
                        flag=true;
                    }
                   
                    else if(flag)
                    {
                        String ch = ""+c;
                        ch=ch.toUpperCase();
                        out=out+ch;
                        flag=false;
                    }
                    else
                    {    out=out+c;
                    
                    }
                }
            }
            else
            {
                int len = read.length();
               
                for(int i=0;i<len;i++)
                {
                    char c = read.charAt(i);
                    if((c>65)&&(c<97))
                    {
                        String ch = ""+c;
                        ch=ch.toLowerCase();
                        out=out+"_"+ch;
                    }
                    else
                        out=out+c;
                }
            }
            System.out.println(out);
            read=in.readLine();
            read=read.trim();
            if(read.isEmpty())
                break;
            
        }
    }
    
}
