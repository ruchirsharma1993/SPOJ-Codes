
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TheBlindPassenger10639 
{
    public static void main(String args[]) throws IOException
    {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String read = in.readLine();
        while(read.isEmpty())
            read=in.readLine();
        read=read.trim();
        
        int test = Integer.parseInt(read);
         read = in.readLine();
            
        for(int i=0;i<test;i++)
        {
            String spos="",side="";
            read=read.trim();
           // read=in.readLine();
            int num=Integer.parseInt(read);
            //System.out.println("REad: "+read);
            if(num==1)
            {
                System.out.println("poor conductor");
                read=in.readLine();
                continue;
            }
         
             int seatId=(num-2)%10;
            char sId = 0,direction = 0;
            switch(seatId)
            {
                case 0:
                    sId='W';
                    direction='L';
                    break;
                case 1:
                    sId='A';
                    direction='L';
                    break;
                case 2:
                    sId='A';
                    direction='R';
                    break;
                case 3:
                    sId='M';
                    direction='R';
                    break;
                case 4:
                    sId='W';
                    direction='R';
                    break;   
                case 5:
                    sId='W';
                    direction='R';
                    break;
                case 6:
                    sId='M';
                    direction='R';
                    break;
                case 7:
                    sId='A';
                    direction='R';
                    break;
                case 8:
                    sId='A';
                    direction='L';
                    break;
                case 9:
                    sId='W';
                    direction='L';
                    break;                     
            }
             int row = ((num-2)/5)+1;
            
            System.out.println(row+" "+sId+" "+direction);
        
            /*int ch = num%10;
            if((ch==2)||(ch==1))
            {
                spos="W";
                side="L";
            }
             if((ch==6)||(ch==7))
            {
                spos="W";
                side="R";
            }
            if((ch==3)||(ch==0))
            {
                    spos="A";
                    side="L";
            
            }
            if((ch==4)||(ch==9))
            {
                side="R";
                spos="A";
            
            }
            if((ch==5)||(ch==8))
            {
                    spos="M";
                    side="R";
            }
            
            int row = ((num-2)/5)+1;
            
            System.out.println(row+" "+spos+" "+side);
             read = in.readLine();
            
             if(read==null)
                break;*/
        }
    }
    
}
