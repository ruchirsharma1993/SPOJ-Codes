
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SpecialString9387 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
           int A[] = new int[50];
        int B[] = new int[50];
        
          A[1] = 2;
          B[1] = 1;
          A[2] = 3;
          B[2] = 6;
         for(int i = 3 ; i < 31 ; i++)
         {
                  A[i] = A[i-1]+ B[i-1];
                  B[i] = 2*A[i-1]+B[i-1];
         }
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int num = sc.nextInt();
            System.out.println(A[num]+B[num]);
        
     

        }
    }
    
}
