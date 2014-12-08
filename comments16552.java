/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class comments16552 
{
    public static void main(String args[]) throws Exception
    {
               int ct1=0, ct2=0;

        try
        {
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        String s = in.readLine();
        //    System.out.println("Read OutSide"+s);
      // System.out.println("S is:"+s);
        while(s!=null)
        {
                int indt1=-1;
                int indt2=-1;
                boolean t1=false,t2=false;
                
                if(s.contains("//"))
                {
                    indt1=s.indexOf("//");
                    t1=true;
                }
                if(s.contains("/*"))
                {
                    indt2 = s.indexOf("/*");
                    t2=true;
                }
                
                if((t1)&&(t2))
                {
                    if(indt1<indt2)
                    {
                        ct1++;
                           //  System.out.print("CT1 Incremented"+ct1);
                             
                    }
                    else
                    {
                         int eind=-1;
                         boolean flag=true;
                        
                         s=s.substring(indt2+2); 
                      //  System.out.println("S (sub1)is:"+s);
                                  
                         //   while(s.contains("/*")){
                         while(flag)
                        {
                             if(s.contains("*/"))
                             {

                                    flag=false;
                                    eind = s.indexOf("*/");
                                    
                                    if((eind<indt1))
                                    {
                                       ct1++;
                                    
                          //   System.out.print("CT1 Incremented"+ct1);
                             
                                       ct2++;
                                    
                            // System.out.print("CT2 Incremented"+ct2);
                             
                                    }
                                    else
                                    {
                                        ct2++;
                            // System.out.print("CT2 Incremented"+ct2);
                             
                                    }
                                     s=s.substring(eind+2);
                                     
                               //     System.out.println("S (sub)is:"+s);
                                     if((s.contains("//"))&&!(s.contains("/*")))
                                     {      
                                            ct1++;
                                           //  System.out.print("CT1 Incremented"+ct1);
                                             continue;
                                       }
                                }
                            else
                             {
                                 s=in.readLine();
                               
                                   // System.out.println("Inside Loop S is:"+s);
                                 if(s.isEmpty())break;  
        
                             }
                        }
                        // }
                    }
                }
                else if(t1)
                {
                    ct1++;
                   // System.out.print("CT1 Incremented"+ct1);
                             
                }
                else if(t2)
                {
                    int eind;
                    boolean flag=true;
                    while(flag)
                    {
                        if(s.contains("*/"))
                        {
                             eind = s.indexOf("*/");
                             ct2++;
                           //  System.out.print("CT2 Incremented"+ct2);
                             flag=false;
                        }
                        if(flag)
                         {
                             s=in.readLine();
                            // System.out.println("Second Loop S is:"+s);
                             if(s.isEmpty())break;  
                         }
                    }
                }
            
            s=in.readLine();

          // System.out.println("S Last is:"+s);
                               
            if(s.isEmpty())break;  
        }
        System.out.println(ct1+" "+ct2);
        
    }catch(Exception e)
        {System.out.println(ct1+" "+ct2);
        }
    }
}
