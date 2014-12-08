/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
public class NISQ14 
{
    public static void main(String args[])
    {
        String s = "101010"; //Six Bit String
        String row = s.substring(0, 1)+ s.substring(5);
        String col = s.substring(1, 5);
        System.out.println(row+" : "+col);
        System.out.println("Row is:"+convert(row));
        System.out.println("Column Number is:"+convert(col));
        
    }
   static int convert(String s)
   {
       // Function to convert binary string to decimal value
       int len = s.length();
       int fac = 1;
       int num = 0;
       for(int i=len-1;i>=0;i--)
       {
           String sub = s.substring(i,i+1);
           if(sub.equalsIgnoreCase("1"))
               num = num+fac;
           
           fac=fac*2;
       }
       
       return num;
       
   }
    
}
