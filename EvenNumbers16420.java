
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class EvenNumbers16420 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            if(num%2!=0)
                System.out.println(num);
            else
            {
                
                String out="";
                while(num>0)
                {
                    int temp = num%2;
                    num=num/2;
                    
                    if(temp==0)
                        out = "1"+out;
                    else
                        out="0"+out;
                }
                        
                System.out.println("out"+out);
               
                //converting
                int val = Integer.parseInt(out, 2);
                System.out.println(val);
            }
        }
    }
    
}
