/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class haijollyjollyjolly12319 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int test = Integer.parseInt(in.readLine());
        for(int i=0;i<test;i++)
        {
            int count=0;
            String s = in.readLine();
            while(s==null)
                s=in.readLine();
          
           /* if((s.length()>5)&&(s.substring(s.length()-5).equals("16884")))
            {
                     System.out.println("Yes No");   
                     continue;
           
            }*/
           
            for(int j=0;j<s.length();j++)
            {
               // count+=Integer.parseInt((String)s.charAt(j));
                count+=Integer.parseInt(s.substring(j,j+1));
            }
            boolean t252=false,t525=false;
           //System.out.println("Count is: "+count);
           int end = Integer.parseInt(s.substring(s.length()-1));
      
           if((count%9==0)&&(end%2==0))
            {
                t252=true;
            }
            if((count%3==0)&&(end%5==0))
            {
                t525=true;
            }
           if(s.length()<=3)
           {
               int num = Integer.parseInt(s);
               if(num<252)
               { 
                   System.out.println("No No");
                   continue;
               }
               if(num<525)
                   t525=false;
           } 
            if(t252&&t525)
                System.out.println("Yes Yes");
            else if(t252&&!t525)
                System.out.println("Yes No");   
            else if(!t252&&t525)
                System.out.println("No Yes");   
            else 
                System.out.println("No No");   
 
           s="";
           count=0;
            
        }
      /*  for(int i=1;i<100000;i++)
            System.out.println(525*i);
    */
    }
    
}
