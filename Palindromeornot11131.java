import java.util.Scanner;public class Palindromeornot11131{public static void main(String g[]){Scanner s = new Scanner(System.in);int t=s.nextInt();for(int i=0;i<t;i++){String r=s.next();StringBuilder w=new StringBuilder(r);StringBuilder q=w.reverse();if(q.equals(w))System.out.println(i+"\"NO\"");else System.out.println(i+"\"YES\"");}}}