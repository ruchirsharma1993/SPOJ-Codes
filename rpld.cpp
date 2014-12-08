#include<stdio.h>
#include<map>

using namespace std;
int main()
{
	int t,i,j,k,l;
	scanf("%d",&t);
	for(l=0;l<t;l++)
	{
		int n,r;
		scanf("%d %d",&n,&r);
		int flag=0;
		
		std::map<mkey,int> m;
		for(i=0;i<r;i++)
		{
			mkey newk;
			int c,s;
			scanf("%d %d",&c,&s);
			if(flag==0)
			{	
				newk.cid=c;
				newk.sid=s;
				if (m.find(newk) == m.end())
				{
					m[newk]=s;
					printf("\nPair %d %d not found",c,s); 
				}
				else
				{
					printf("\nPair %d %d is found",c,s); 
				
					flag=1;
				}
			}	
		}	
		
		//Print output
		if(flag==1)
		{
			printf("Scenario #%d: impossible",l+1);
			
		}
		else
		{
			printf("Scenario #%d: possible",l+1);
				
		}
		printf("\n");
	}
	return 0;
}
