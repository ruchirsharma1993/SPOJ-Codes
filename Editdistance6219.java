
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
public class Editdistance6219 
{
    
   public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        for(int l=0;l<test;l++)
        {
        
            String correct=sc.nextLine();
            String incorrect=sc.nextLine();

            int i=correct.length(),j=incorrect.length();
            ++i ; ++j;
            int a[][] = new int[i][j];
            int b[] = new int[3];       
            for(int m=0;m<i;m++)
                for(int n=0;n<j;n++)
                {

                            if(m==0 || n==0)
                            {
                              a[0][n]=n;
                              a[m][0]=m;
                            }
                            else
                            {
                                b[0]=a[m-1][n-1]; b[1]=a[m-1][n]; b[2]=a[m][n-1];


                                if ( correct.charAt(m-1) == incorrect.charAt(n-1)  )
                                {
                                    a[m][n]=a[m-1][n-1];
                                }

                                else
                                {
                                    for(int t=0;t<2;t++)
                                        for(int u=0;u<2-t;u++)
                                            if(b[u]>b[u+1])
                                                b[u]=b[u+1];


                                    a[m][n]=b[0]+1;


                                }

                            }

                }


            /*for(int m=0;m<i;m++)
            {
                for(int n=0;n<j;n++)
              //      System.out.print( a[m][n] +"  ");  
                System.out.print("\n");                
            }*/



            System.out.println(a[i-1][j-1]);

        }
    }

}