#include<stdio.h>
#include<iostream>
using namespace std;
char arr[51][51];
int val[51][51];
int dfs(int i,int j,int h,int w,char req)
{
//	printf("\nhere for %d %d its a %c",i,j,arr[i][j]);
	if(val[i][j]!=-1)
		return val[i][j];
	int max=-1;
	//DFS
	if(i-1>=0)
	{
		//Check for i-1,j-1
		if(j-1>=0)
		{
			if(arr[i-1][j-1]==req)
			{
				if(val[i-1][j-1]!=-1)
				{
					if(max<val[i-1][j-1])
						max=val[i-1][j-1];
				}
				else
				{
					int t1 = 1+dfs(i-1,j-1,h,w,req+1);
					val[i-1][j-1]=t1;
					if(t1>max)
						max=t1;
				}
			}
		}
		
		// Check for i-1,j
		if(arr[i-1][j]==req)
		{
				if(val[i-1][j]!=-1)
				{
					if(max<val[i-1][j])
						max=val[i-1][j];
				}
				else
				{
					int t1 = 1+dfs(i-1,j,h,w,req+1);
					val[i-1][j]=t1;
					if(t1>max)
						max=t1;
				}
		}
		
		//Check for i-1,j+1
		if(j+1<w)
		{
			if(arr[i-1][j+1]==req)
			{
				if(val[i-1][j+1]!=-1)
				{
					if(max<val[i-1][j+1])
						max=val[i-1][j+1];
				}
				else
				{
					int t1 = 1+dfs(i-1,j+1,h,w,req+1);
					val[i-1][j+1]=t1;
					if(t1>max)
						max=t1;
				}
			}
		}
	}
	
	//Check for i,j-1
	if(j-1>=0)
	{
		if(arr[i][j-1]==req)
		{
				if(val[i][j-1]!=-1)
				{
					if(max<val[i][j-1])
						max=val[i][j-1];
				}
				else
				{
					int t1 = 1+dfs(i,j-1,h,w,req+1);
					val[i][j-1]=t1;
					if(t1>max)
						max=t1;
				}
		}
		
		//Check for i+1,j-1
		if(i+1<h)
		{
			if(arr[i+1][j-1]==req)
			{
					if(val[i+1][j-1]!=-1)
					{
						if(max<val[i+1][j-1])
							max=val[i+1][j-1];
					}
					else
					{
						int t1 = 1+dfs(i+1,j-1,h,w,req+1);
						val[i+1][j-1]=t1;
						if(t1>max)
							max=t1;
					}
			}
		}
	}
	
	//Check for i+1,j
	if(i+1<h)
	{
			if(arr[i+1][j]==req)
			{
					if(val[i+1][j]!=-1)
					{
						if(max<val[i+1][j])
							max=val[i+1][j];
					}
					else
					{
						int t1 = 1+dfs(i+1,j,h,w,req+1);
						val[i+1][j]=t1;
						if(t1>max)
							max=t1;
					}
			}
	}

	//Check for i,j+1
	if(j+1<w)
	{
			if(arr[i][j+1]==req)
			{
					if(val[i][j+1]!=-1)
					{
						if(max<val[i][j+1])
							max=val[i][j+1];
					}
					else
					{
						int t1 = 1+dfs(i,j+1,h,w,req+1);
						val[i][j+1]=t1;
						if(t1>max)
							max=t1;
					}
			}
	}

		//Check for i,j+1
	if(i+1<h&&j+1<w)
	{
			if(arr[i+1][j+1]==req)
			{
					if(val[i+1][j+1]!=-1)
					{
						if(max<val[i+1][j+1])
							max=val[i+1][j+1];
					}
					else
					{
						int t1 = 1+dfs(i+1,j+1,h,w,req+1);
						val[i+1][j+1]=t1;
						if(t1>max)
							max=t1;
					}
			}
	}	

	if(max==-1)
		return 0;
	return max;
	
}	
int main()
{
	int h,w,out=1;
	scanf("%d %d",&w,&h);
	while(h!=0&&w!=0)
	{
		int i,j;
		for(i=0;i<w;i++)
		{
			//printf("Read:");
			for(j=0;j<h;j++)
			{		
				cin>>arr[i][j];
				//scanf("%c",&arr[i][j]);
			//	printf("%c",arr[i][j]);
				
				val[i][j]=-1;
			}
		//	printf("\n");
		}
		
		//Start Dfs
		int max = -1;
		for(i=0;i<w;i++)
		{
			for(j=0;j<h;j++)
			{		
				if(arr[i][j]=='A')
				{
					int t1=1+dfs(i,j,w,h,'B');
					if(t1>max)
						max=t1;
				}
			}
		}
		if(max==-1)
			max=0;
		printf("Case %d: %d",out,max);
		out++;
		printf("\n");
		scanf("%d %d",&w,&h);
	}
	return 0;
}
		