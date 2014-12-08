import java.util.Scanner;
public class challengeSizeContest378 
{   public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        int t,r,sum=0,i;t = sc.nextInt();for(i=0;i<t;i++)
        {r = sc.nextInt();
            if(r>0) sum+=r;}
        System.out.println(sum);
     }}
