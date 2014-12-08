


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class Mystery5 
{
    public static void main(String args[]) throws Exception
    {
        java.io.BufferedReader in  = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int test = Integer.parseInt(in.readLine());
        int arr[] = new int[28];
        String comp = "abcdefghijklmnopqrstuvwxyz";    
        for(int i=0;i<test;i++)
        {
            for(int j=0;j<27;j++)
                arr[j] = 0;
        
            String s = in.readLine();
            int len = s.length();
            int max = 0;
            for(int j=0;j<len;j++)
            {
                String c = s.substring(j,j+1);
                int loc= comp.indexOf(c);
                arr[loc]++;
                if(arr[loc]>max)
                    max = arr[loc];
            }
            System.out.println(max);
                
        }
    }
    
}
