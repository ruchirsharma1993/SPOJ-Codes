
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FibonacciWithaTwist11409 
{

    public static void main(String args[])
    {
        //long fo=0;
        //long f1=1;
        //long count=2;
       BigInteger f0 = BigInteger.ZERO;
       BigInteger f1 = BigInteger.ONE;
       BigInteger count = new BigInteger("2"); 
     /*
     Scanner sc = new Scanner(System.in);
         BigInteger num = sc.nextBigInteger();
    BigInteger s = check(num);
    System.out.println(s);
    
      */
     BigInteger ftr=new BigInteger("10000000000");
       while(f1.compareTo(ftr)<0)
                {
        //ft(n) = ft(n-1) + ft(n-2) + (n-1) ;
        //long next = fo+f1;
        BigInteger next = f0;
        next=next.add(f1);
        
       // System.out.println("Count="+count+": "+next);
        System.out.print(""+next+",");
        f0=f1;
        f1=next;
        count=count.add(BigInteger.ONE);
                }
       System.out.println("Total: "+count);
    
       }

    private static BigInteger check(BigInteger num) {
        String arr[]={  "1","2","3","5","8","13","21","34","55","89","144","233","377","610","987","1597","2584","4181","6765","10946","17711","28657","46368","75025","121393","196418","317811","514229","832040","1346269","2178309","3524578","5702887","9227465","14930352","24157817","39088169","63245986","102334155","165580141","267914296","433494437","701408733","1134903170","1836311903","2971215073","4807526976","7778742049","12586269025","20365011074","32951280099","53316291173","86267571272","139583862445","225851433717","365435296162","591286729879","956722026041","1548008755920","2504730781961","4052739537881","6557470319842","10610209857723","17167680177565","27777890035288","44945570212853","72723460248141","117669030460994","190392490709135","308061521170129","498454011879264","806515533049393","1304969544928657","2111485077978050","3416454622906707","5527939700884757","8944394323791464","14472334024676221"};
    String s="";
    BigInteger retval=BigInteger.ZERO;
    System.out.println("FOr num="+num);
    for(int i=1;i<75;i++)
    {
        BigInteger val =new BigInteger(arr[i]);
        if(val.equals(num))
        {
           // System.out.println(arr[i+1]);
            BigInteger sval = new BigInteger(arr[i+1]);
            retval=retval.add(sval);
            return retval;
        }
        
        if(val.compareTo(num)>0)
        {
            BigInteger prevval = new BigInteger(arr[i-1]);
            num=num.subtract(prevval);
            s=s+""+val; 
           // retval = retval+check(num);
            retval=retval.add(check(num));
        }
        
    }
        return retval;
    }
    
}
