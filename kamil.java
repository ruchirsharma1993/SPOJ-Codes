public class kamil {
    public static void main(String a[]) throws Exception{
        
    java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
       for(int i=0;i<1;i++)
       {
           String t = in.readLine();int c=1;
           for(int j=0;j<t.length();j++)
           {
               String t1 = t.substring(j,j+1);
               if(t1.equalsIgnoreCase("L")||t1.equalsIgnoreCase("F")||t1.equalsIgnoreCase("G")||t1.equalsIgnoreCase("K"))
                 c++;
           }
           System.out.println(c);
       }
}
    
}
