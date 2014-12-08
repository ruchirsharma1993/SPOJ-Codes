
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SummationofMultiples14863
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
	
        String t = in.readLine();
        while(t.isEmpty())
            t=in.readLine();
        t=t.trim();
        long test = Long.parseLong(t);
        //long test = sc.nextInt();
        for(long i=0;i<test;i++)
        {
        
        t = in.readLine();
        while(t.isEmpty())
            t=in.readLine();
        
        t=t.trim();
        long num = Long.parseLong(t);
        
        //long num = sc.nextInt();
        long temp = num;
        long mul3,mul5;
        mul3=num/3;
        mul5=num/5;
        long mul15=num/15;
        
        if(num%3==0)
            mul3--;
        if(num%5==0)
            mul5--;
        //if(num%15==0)
          //  mul15--;
        
    //  System.out.println(mul3+" : "+mul5+" : "+mul15);
       long sum1 = (mul3)*((2*3)+(mul3-1)*3)/2;
        long sum2 = (mul5)*((2*5)+(mul5-1)*5)/2;
        long sum3 = (mul15)*((2*15)+(mul15-1)*15)/2;
        
      
      //  System.out.println(s21+" : "+s22);
        //System.out.println(sum1+" : "+sum2+" : "+sum3);
        long out = sum1+sum2-sum3;
        System.out.println(out);
    }}
    
}
