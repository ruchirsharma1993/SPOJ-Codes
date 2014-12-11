#include<stdio.h>
#include<map>
#include<string.h>
using namespace std;

struct cmp_str
{
   bool operator()(char const *a, char const *b)
   {
      return std::strcmp(a, b) < 0;
   }
};
int main()
{
	int t;
	scanf("%d",&t);
	for(int l=0;l<t;l++)
	{
		map<char *, int,cmp_str > m;
		map<char *, int,cmp_str > ::iterator it;
		for(int i=0;i<16;i++)
		{
			char t1[15],t2[15];
			int g1,g2;
			scanf("%s %s",t1,t2);
			scanf("%d %d",&g1,&g2);
		
			
			if( m.find(t1) == m.end())
			{ 
				if(g1>g2)
					m[t1]=1;
				else
					m[t1]=0;
			}
			else
			{
				if(g1<g2)
					m[t1]=0;
			}
			
			
			if( m.find(t2) == m.end())
			{ 
				if(g1<g2)
					m[t2]=0;
				else
					m[t2]=1;	
			}
			else
			{
				if(g1>g2)
					m[t2]=0;
			}
			
		}
		for( it = m.begin() ; it != m.end() ; it++)
		{
			printf("\n%s %d",it->first,it->second);
		}
		
	}
		return 0;
}			