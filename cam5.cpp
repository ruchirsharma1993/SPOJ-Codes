#include<stdio.h>
#include<vector>
using namespace std;
int visited[100005];
vector<int> nodes[100005];
void dfs(int j)
{
	//printf("\nVisited %d",j);
	for(int i=0;i<(int)nodes[j].size();i++)
	{
		if(visited[nodes[j][i]]==0)
		{
			visited[nodes[j][i]]=1;
			dfs(nodes[j][i]);
			
		}
	}
	
}

int main()
{
	int t;
	scanf("%d",&t);
	for(int y=0;y<t;y++)
	{
		int n,e;
		scanf("%d",&n);
		for(int j=0;j<n+2;j++)
		{
			visited[j]=0;
			nodes[j].clear();
		}	
	
		scanf("%d",&e);
		for(int j=0;j<e;j++)
		{
			int a,b;
			scanf("%d %d",&a,&b);
			nodes[a].push_back(b);
			nodes[b].push_back(a);
		}
	
	//	printf("Starting DFS");
		//Start DFS
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(visited[j]==0)
			{
				visited[j]=1;
				dfs(j);
				count++;
			}
		}
		printf("%d\n",count);
	}
	return 0;
	
}
	