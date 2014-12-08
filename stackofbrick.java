/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class stackofbrick 
{
    public static void main(String args[])throws Exception
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int test = Integer.parseInt(in.readLine());
        int arr[]=new int[test];
        int sum=0;
        for(int i=0;i<test;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
            sum+=arr[i];
        }
        int avg = sum/test;
        int less=0,more=0;
        for(int i=0;i<test;i++)
        {
            if(arr[i]>avg)
            {
                int temp = arr[i]-avg;
                more+=temp;
                
            }
            else if(arr[i]<avg)
            {
                int temp = avg-arr[i];
                less+=temp;
            }
            else
            {
                //Do Nothing
            } 
        }
        if(more>less)
            System.out.println(less);
        else
            System.out.println(more);
            
    }
    
}
