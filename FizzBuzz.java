
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class FizzBuzz 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int n = sc.nextInt();
            for(int j=1;j<=n;j++)
            {
                boolean th=false,fv=false ;
                if(j%3==0)
                    th=true;
                if(j%5==0)
                    fv=true;
                if(th&&fv)
                    System.out.println("FizzBuzz");
                else if(th&&!fv)
                    System.out.println("Fizz");
                else if(!th&&fv)
                    System.out.println("Buzz");
                else
                        System.out.println(j);
                
                            
            }
        }
    }
    
}
