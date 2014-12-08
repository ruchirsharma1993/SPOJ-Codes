/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Primechecker919 
{
    public static void main(String args[])
    {
        long a = 1;
        long add = 1234567890;
        String out="";
        for(long i=0;i<100000;i++)
        {
            if(isPrime(a))
                out=out+"1";
            else
                out=out+"0";
            a = (a+ add)%(2^31);
            
        }
        System.out.println(out);
    }

    private static boolean isPrime(long a) {
        if(a==0)
            return false;
        
        if(a%2==0)
            return false;
        String s = ""+a;
        
        if(s.endsWith("5"))
            return false;
        int tot=0;
        
        for(int i=0;i<s.length();i++)
            tot+=Integer.parseInt(s.substring(i, i+1));
        
        if(tot%3==0)
            return false;
        
        if(tot%7==0)
            return false;
        
        if(a%6!=1)
            return false;
        
        return true;
    }
    
}
