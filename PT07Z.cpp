#include<vector>
#include<iostream>
#include<stdio.h>
using namespace std;

int gnode=-1;
int gmax=-1;


void findfunc(int f,int cur, int max, vector<int> arr[],int vis[])
{
	unsigned i;
	//printf("\nReached %d dist is %d",cur,max);
	
	for(i=0;i<arr[cur].size();i++)
	{
		//printf("\ndiff b/w %d and %d is %d",cur,arr[cur][i],max);
		int next = arr[cur][i];
		
		
		//printf("\t bw %d and %d is: %d",cur,next,add);
		
		if((vis[next]==-1)&&(next!=f))
		{
			int nmax=max+1;
			//printf("nmax is: %d",nmax);
			vis[next]=1;
			if(nmax>gmax)
			{
				gnode=next;
				gmax=nmax;
			}
			findfunc(f,next,nmax,arr,vis);
		}
	}
}	

int main()
{
	
		 gnode=-1;
		 gmax=-1;
		
		int i,n;
		scanf("%d",&n);
		vector<int> arr[n+1];
		//int cur;
		int u,v;
		
		for(i=0;i<(n-1);i++)
		{
			//printf("Waiting");
			scanf("%d %d",&u,&v);
		
			arr[u].push_back(v);
			arr[v].push_back(u);
		}
		//printf("here");
		int vis[n+2];
		int vis1[n+2];

		//start the DFS from u
		for(int i=1;i<=n;i++)
		{
			vis[i]=-1;
			vis1[i]=-1;
			
		}
		
		
		findfunc(u,u,0,arr,vis);
		
		/*int max = -1;
		int node=-1;
		for(i=1;i<=n;i++)
		{
			//printf("\ndist of %d and %d is %d",u,i,vis[i]);
			if((vis[i]>max)&&(i!=u))
			{
				max= vis[i];
				node = i;
			}
		}
		*/
		//printf("max is :%d node is %d",gmax,gnode);
		
		
		
		//Second call
		gmax=-1;
		findfunc(gnode,gnode,0,arr,vis1);
		
		/* max = -1;
		//int node1=-1;
		for(i=1;i<=n;i++)
		{
			//printf("\ndist of %d and %d is %d",u,i,vis[i]);
			if((vis[i]>max)&&(i!=node))
			{
				max= vis[i];
				//node1 = i;
			}
		}
		*/
		//printf("\nII max is :%d node is %d",gmax,gnode);
		printf("%d",gmax);
		printf("\n");
		
		
	
}
