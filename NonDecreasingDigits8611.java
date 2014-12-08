/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NonDecreasingDigits8611
{
    public static void main(String args[])
    {
        int count = 0;
        int i  =1;
        while(i<9)
        {
            for(int j=0;;j++)
            {
                String s = ""+j;
                if(s.length()>i)
                    break;
                
                //checking if non decreasing
                int num = j,last=Integer.MAX_VALUE;
                boolean flag=true;
                while(num>0)
                {
                    int t = num%10;
                    num=num/10;
                    if(t>last)
                    {
                        flag= false;
                        break;
                    }
                    last = t;
                }
                if(flag)
                        count++;
                            
            }
            System.out.println("i: "+i+"count: "+count);
            i++;
            count=0;
        }
    }
    
}
