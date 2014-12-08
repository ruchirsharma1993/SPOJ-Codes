
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class P0110SSNo10676
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //long a=2,b=3;
      //  String s ={};
        
        BigInteger a= new BigInteger("2");
        BigInteger b= new BigInteger("3");
        
        BigInteger val = a;
            
        if(n==1)
            System.out.println(a);
        else if(n==2)
            System.out.println(b);
        else
        {
            for(int i=2;i<n;i++)
            {
                val=a.add(b);
              //System.out.println("*"+val+"*,");
                BigInteger temp=b;
                b=b.add(a);
                a=temp;
                //System.out.println("a= "+a);
                //System.out.println("b= "+b);
                
            }
            System.out.println(val);
        }  
    }
    
}
