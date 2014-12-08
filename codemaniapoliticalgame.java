
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 * http://www.codechef.com/CDMN2014/problems/PG
 */
public class codemaniapoliticalgame 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       for(int i=0;i<test;i++)
       {
           String read = sc.next();
           int len = read.length();
           String n = read.substring(len-1);
           
           long num = sc.nextLong();
           int res=0;
           if(n.equals("0"))
           {
               if(num==0)
                   System.out.println("1");
               else
                   System.out.println("0");
               
           }
           else if(n.equals("1"))
           {
               System.out.println(n);
           }
           else
           {
               if(n.equals("2"))
               {
                   res = (int) (num%4);
                   switch(res)
                   {
                       case 0: System.out.println("6");
                           break;
                       case 1: System.out.println("2");
                           break;
                          
                       case 2: System.out.println("4");
                           break;
                       
                       case 3: System.out.println("8");
                               
                   }
               }
               else  if(n.equals("3"))
               {
                   res = (int) (num%4);
                   switch(res)
                   {
                       case 0: System.out.println("1");
                           break;
                       case 1: System.out.println("3");
                           break;
                          
                       case 2: System.out.println("9");
                           break;
                       
                             case 3: System.out.println("7");
                           
                                                  
                   }
               }
               
                 else  if(n.equals("4"))
               {
                   res = (int) (num%2);
                   switch(res)
                   {
                       case 0: System.out.println("6");
                           break;
                       case 1: System.out.println("4");
                                                  
                   }
               }
               
                 else  if(n.equals("5"))
               {
                   System.out.println("5");
                                               
                   
               }
                
                 else  if(n.equals("6"))
               {
                   System.out.println("6");
                                               
                   
               }
               
                
                 else  if(n.equals("7"))
               {
                   
                   res = (int) (num%4);
                   switch(res)
                   {
                       case 0: System.out.println("1");
                           break;
                       case 1: System.out.println("7");
                           break;
                       case 2: System.out.println("9");
                           break;
                       
                       case 3: System.out.println("3");
                                                  
                   }              
                   
               }
               
               
                     
                 else  if(n.equals("8"))
               {
                   
                   res = (int) (num%4);
                   switch(res)
                   {
                       case 0: System.out.println("6");
                           break;
                       case 1: System.out.println("8");
                           break;
                       case 2: System.out.println("4");
                           break;
                       
                       case 3: System.out.println("2");
                                                  
                   }              
                   
               }
                else  if(n.equals("9"))
               {
                   res = (int) (num%2);
                   switch(res)
                   {
                       case 0: System.out.println("1");
                           break;
                      
                       case 1: System.out.println("9");
                                                  
                   }
               }
           }
               
       }
       
    }
    
    
}
