
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SHAHBAG13707 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean arr[] = new boolean[20002];
        int count=0;
        for(int i=0;i<num;i++)
        {
            int n = sc.nextInt();
            
            arr[n]=true;
            
            if(i==0)
                count++;
            
            else if((arr[n+1])&&arr[n-1])
            {
                count--;
            }
            else if(arr[n+1]||arr[n-1])
            {}
            else
                count++;
            System.out.println(count);
            
            if(!sc.hasNextInt())
                break;
        }
     System.out.println("Justice\n");   
    }
    
}
