
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruchir
 */
class query
{
    String type;
    int count;
    float score;
    String data;
    
    public void settype(String s)
    {
        this.type = s;
    }
    
    public void setdata(String s)
    {
        this.data = s;
    }
    public void setscore(float s)
    {
        this.score = s;
    }
    public void setcount(int n)
    {
        this.count = n;
    }
    
    public int getcount()
    {
        return this.count;
    }
    public String gettype()
    {
        return this.type;
    }
   
    public String getdata()
    {
        return this.data;
    }
    public float getscore()
    {
        return this.score;
    }
    
    
}


public class quoratype 
{
    public static void main(String args[]) throws Exception
    {
        List<query> list = new ArrayList<query>();
        Map<String,query> m = new HashMap<String,query>();
        
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = in.readLine();
        s= s.trim();
        int n = Integer.parseInt(s);
        for(int i=0;i<n;i++)
        {
            s = in.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String qtype = st.nextToken();
            if(qtype.equals("ADD"))
            {
                
                System.out.print("ADDING");
                query q = new query();
                q.settype(st.nextToken());
                String id = st.nextToken();
                float f = Float.parseFloat(st.nextToken());
                q.setscore(f);
                q.setcount(i);
                String data="";
                while(st.hasMoreElements())
                {
                    data = data+" "+st.nextToken();
                }
                q.setdata(data);
                
                m.put(id,q);
               // print(m);
            }
                    
            else if(qtype.equals("DEL"))
            {
                
                System.out.print("DELETING");
                String id  = st.nextToken();
                if(m.containsKey(id))
                    m.remove(id);
                
                print(m);
            }
            
            else if(qtype.equals("QUERY"))
            {
               System.out.println("SEARCHING");
                int num = Integer.parseInt(st.nextToken());
                
                String search = st.nextToken();
                while(st.hasMoreElements())
                    search  = search + " "+st.nextToken();
                
                Map<query,String> res= new HashMap<query,String>();
                Iterator itr = m.entrySet().iterator();
                while(itr.hasNext())
                {
                    Map.Entry me = (Map.Entry<String,query>)itr.next();
                    String id = (String) me.getKey();
                    query q1  = (query) me.getValue();
                    
                    String data = q1.getdata();
                    if(data.contains(search))
                    {
                        res.put(q1,id);
                    }
                }
               	
                ValueComparator bvc =  new ValueComparator(res);
                
                List lis = new LinkedList(res.entrySet());
                
                //Collections.sort(lis,Comparators.comp);
                
                String out="";int c=0;
              
		for (Iterator it = lis.iterator(); c<num;c++) 
                {
			Map.Entry entry = (Map.Entry) it.next();
			out = out+" "+entry.getKey();
		}
            
                System.out.println(out);
            }
            
         //   print(m);
        }
        
        
 

    }

    private static void print(Map<String,query> m)
    {
        System.out.println("Printing");
        Iterator itr = m.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry e = (Map.Entry) itr.next();
            query q = (query) e.getValue();
            System.out.println(e.getKey()+": "+q.gettype()+": "+q.getdata());
        }
    }

    

 class ValueComparator implements Comparator<query> {

    Map<query,String> res;
    public ValueComparator(Map<query,String> res) {
        this.res = res;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
        @Override
    public int compare(query o1, query o2)
        {
        
           float s1 = o1.getscore();
                        float s2 = o2.getscore();
                        if(s1>s2)
                            return 1;
                        
                        else if(s1<s2)
                            return -1;
                        
                        else if(s1==s2)
                        {
                            int n1 = o1.getcount();
                            int n2 = o1.getcount();
                            if(n1>n2)
                                return 1;
                            else if(n1<n2)
                                return -1;
                            else 
                                return 0;
                        }
                        
                        return 0;
   
        }
}   
}
