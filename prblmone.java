/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class prblmone 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
         Scanner sc = new Scanner(System.in);
         
         //Reading Number of Friends
         String ns = in.readLine();
         int n = Integer.parseInt(ns);
         
         //Reading friends who have watched
         String watch = in.readLine();
         
         //Reading Number of Lists
         String ls = in.readLine();
         int l = Integer.parseInt(ls);
         String lists[] = new String[l+1];
         for(int i=0;i<l;i++)
         {
             lists[i] = in.readLine();
         }
       
         //Reading number of posts
         String ps = in.readLine();
         int p = Integer.parseInt(ps);
         String post[][] = new String[p][2];
         
         int count=0;
        for(int i=0;i<p;i++)
        {
         //reading Includes post
        // System.out.println("For post"+i);
         String read = in.readLine();
         if(read.equals("0"))
         {
          //Do Nothing   
         }
         else
         {
             StringTokenizer st = new StringTokenizer(read);
             int num = Integer.parseInt(st.nextToken());
             String check="";
             for(int j=0;j<num;j++)
             {
                 int listnum = Integer.parseInt(st.nextToken());
                 check = check+" "+lists[listnum]; 
                 
             }
             //System.out.println("Check is"+ check);
             // Iterating Who has watched
             st = new StringTokenizer(watch);
              num = Integer.parseInt(st.nextToken());
             String chckfor="";
             for(int j=0;j<num;j++)
             {
                 chckfor=" "+st.nextToken();
                 if(!check.contains(chckfor))
                 {
                     //System.out.println("Not in Include list but has watched"+chckfor);
                     count++;
                     break;
                 }
             }
         }
             
        //Reading Excludes Post
         
         read = in.readLine();
         if(read.equals("0"))
         {
             //Do Nothing
         }
         else
         {
              StringTokenizer st = new StringTokenizer(read);
              int num = Integer.parseInt(st.nextToken());
               String check="";
             for(int j=0;j<num;j++)
             {
                 int listnum = Integer.parseInt(st.nextToken());
                 check = check+" "+lists[listnum]; 
                 
             }
             //Iterating Who to Exclude
              
               st = new StringTokenizer(check);
              num = Integer.parseInt(st.nextToken());
             String chckfor="";
             for(int j=0;j<num;j++)
             {
                 chckfor=" "+st.nextToken()+" ";
                 if(watch.contains(chckfor))
                 {
                     //System.out.println("In Exclude list but has watched"+chckfor);
                     count++;
                     break;
                 }
             }
              
         }
        
        }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         /*
         for(int i=0;i<p;i++)
         {
             boolean flag = true;
             //Include List
             String r = in.readLine();
             r=r.trim();
             if(r.equals("0"))
             {
                 post[i][0] = "k";
             }
             else
             { 
                 post[i][0] = r;
                 StringTokenizer st = new StringTokenizer(watch);
                 int num = Integer.parseInt(st.nextToken());
                 String check="";
                 for(int j=0;j<num&&flag;j++)
                 {
                    //He has watched
                     int checkn = Integer.parseInt(st.nextToken());
                     System.out.println("Use list"+checkn);
                     check = check+" "+lists[checkn];
                 } 
                 
                     StringTokenizer st1 = new StringTokenizer(r);
                     int nc = Integer.parseInt(st1.nextToken());
                     if(nc==0)
                     {continue;}
                     
                     for(int k =0;k<nc;k++)
                     {
                         String check2 = st1.nextToken();
                         String ch = " "+check2+" ";
                         if(!r.contains(ch))
                         {
                             System.out.println("Post  NO."+i+"Not in list but watched !! For"+ch);
                             flag=false;
                             count++;
                             break;
                         }
                     }
                 }
             
             
             //Exclude List
             r = in.readLine();
             r=r.trim();
             if(r.equals("0"))
                post[i][0] = "k";
             
             else if(flag)
             {
                 post[i][1] = r;
               //  System.out.println("In Exclude, r is "+r);
                 StringTokenizer st = new StringTokenizer(r);
                int num = Integer.parseInt(st.nextToken());
                 for(int j=0;j<num;j++)
                 {
                     
                     int checkn = Integer.parseInt(st.nextToken());
                     String check = lists[checkn];
                     String ch = " "+check+" ";
                     if(watch.contains(ch))
                     {
                         System.out.println("Post  NO."+i+"In Exclude List but watched !! For"+ch);
                         flag=false;
                         count++;
                         break;
                     }
                 }
             }
         }
    */
          System.out.println(count);
         
    }
    
    
}
