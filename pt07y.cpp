#include<stdio.h>
#include<vector>
using namespace std;
struct vertex
{
	vector<int> list;
};
int detect(int s,vertex v[],int i,int visited[])
{
	//printf("\nIn for %d",i);
	visited[i]=1;
	for( int j = 0 ; j < (int)v[i].list.size() ; j++ )
	{
		//printf("\nChild of %d is %d",i,v[i].list[j]);
		if(visited[v[i].list[j]]==0)
		{
			if(detect(i,v,v[i].list[j],visited)==1)
			{
				//printf("\treturned 1, so return 1");
				return 1;
			}
		}	
		
           
		else if (v[i].list[j] != s)
		{
			//printf("\n in else");
			return 1;
		}
	}

	//printf("\nfor %d. returning : 0",i);
	return 0;
}
int main()
{
	int n,m;
	scanf("%d",&n);
	scanf("%d",&m);
	int flag=0;
	vertex v[n+2];
	
	for( int i=0;i<m;i++)
	{
		int a,b;
		scanf("%d %d",&a,&b);
		v[a].list.push_back(b);
		v[b].list.push_back(a);
	}

	int visited[n+1];
	
	for(int i=1;i<=n;i++)
	{
		visited[i]=0;
	}
	for(int i=1;i<=n;i++)
	{
		if((visited[i]==0)&&(detect(-1,v,i,visited)==1))
		{	
			flag=1;
			break;
		}
	}
	if(flag==1)
		printf("NO");
	else
		printf("YES");
	printf("\n");
}
