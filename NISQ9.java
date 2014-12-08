/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class NISQ9 
{
    public static void main(String args[])
    {
        String s1="1010";
        String s2="0101";
        
        //XOR of two strings
        int len1 = s1.length();
        int len2 = s2.length();
        int len=0;
        //Padding
        if(len1<len2)
        {
            len=len2;
            for(int i=0;i<len2-len1;i++)
                s1="0"+s1;
        }
        else if(len2<len1)
        {
            len=len1;
            for(int i=0;i<len1-len2;i++)
                s2="0"+s2;
        }
        else
            len=len1;
        
        //Processing XOR
        String res="";
        for(int i=0;i<len;i++)
        {
            String one = s1.substring(i,i+1);
            String two = s2.substring(i,i+1);
            
            if((one.equalsIgnoreCase("1")&&two.equalsIgnoreCase("0"))||(one.equalsIgnoreCase("0")&&two.equalsIgnoreCase("1")))
                res = res+"1";
            else
                res=res+"0";
            
        }
        
        System.out.println("XOR is: "+res);
        
        
        
        
        
    }
    
}
