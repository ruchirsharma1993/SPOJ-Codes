

import java.text.NumberFormat;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TravelingSalesman4993 
{
    public static void main(String args[]) throws Exception
    {
        try{
            
        
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String s = in.readLine();
        while(s.isEmpty())
            s=in.readLine();
        
             double gcal=0;
    NumberFormat n = NumberFormat.getInstance();
    n.setMaximumFractionDigits(3);

             double valx1,valy1;
            int sind=s.indexOf("(");
            int eind=s.indexOf(")");

          //  System.out.println("Sind: "+sind);
           // System.out.println("Eind: "+eind);

            String sval1 = s.substring(sind+1, eind);
          //  System.out.println("Substring: "+sval1);

            StringTokenizer st = new StringTokenizer(sval1,",");
            String svalx1 = st.nextToken();
            svalx1=svalx1.trim();

            valx1 = Double.parseDouble(svalx1);

            String svaly1 = st.nextToken();
            svaly1=svaly1.trim();

            valy1 = Double.parseDouble(svaly1);
           // System.out.println("Initially Point One:"+valx1+":"+valy1);
            
            s=in.readLine();
            
             while(!s.isEmpty())
        
             {
            
               //  System.out.println("Point One:"+valx1+":"+valy1);
                 sind=s.indexOf("(");
                 eind=s.indexOf(")");

                 sval1 = s.substring(sind+1, eind);
                 st = new StringTokenizer(sval1,",");

                 String svalx2 = st.nextToken();
                 svalx2=svalx2.trim();
                 //int valx2 = Integer.parseInt(svalx2);
                 double valx2 = Double.parseDouble(svalx2);

                 String svaly2 = st.nextToken();
                 svaly2=svaly2.trim();
                 //int valy2 = Integer.parseInt(svaly2);
                 double valy2 = Double.parseDouble(svaly2);

              //   System.out.println("Point Two:"+valx2+":"+valy2);
                 float cal;
                 cal = (float) Math.sqrt(((valx2-valx1)*(valx2-valx1))+((valy2-valy1)*(valy2-valy1)));
                 gcal+=cal;
                 String outthis=""+0;
                if(gcal!=0)
                 {String out =""+gcal;
                 int dotind = out.indexOf(".");
                  outthis = out.substring(0,dotind+4);
               //  System.out.println(outthis);
                 }
                 System.out.println("The salesman has traveled a total of "+gcal+" kilometers.");
                 s=in.readLine();
                 
                 valx1=valx2;
                 valy1=valy2;

             }
        }catch(Exception e){return;}
        }
    
}
