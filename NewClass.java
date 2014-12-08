/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass 
{
    public static void main(String args[])throws Exception
    {
        String s[]={"1","2","4","8","16","32","64","128","256","512","1024","2048","4096","8192","16384","32768","137438953472","274877906944","549755813888","1099511627776",      "65536","131072","262144","524288","1048576","2097152","4194304","8388608","16777216","33554432","67108864","134217728","268435456","536870912","1073741824","2147483648","4294967296","8589934592","17179869184","34359738368","68719476736","00"};
        int count=0;
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String read = in.readLine();
        boolean flag=false;
        while(true)
        {
            String st = s[count];
            if(read.equals(st)){
             flag=true;
                break;   
            }if(st.equals("00"))
                break;
            count++;
        }
      //  System.out.println(count);
        if(flag)
            System.out.println("TAK");
        else
            System.out.println("NIE");
            
    } 
    }