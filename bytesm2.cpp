#include<stdio.h>
int arr[101][101], dp[101][101];

int max(int t1,int t2,int t3)
{
	int max=t1;
	if(t2>max)
		max=t2;
	if(t3>max)
		max=t3;
	return max;
}
int func(int i,int j, int h,int w)
{
	
	//printf("\nCalculating for %d %d",i,j);
	if(dp[i][j]!=-1)
		return dp[i][j];
	
	int t1=0,t2=0,t3=0;
	if(i+1<h)
		t1 = func(i+1,j,h,w);
	if(i+1<h&&j-1>=0)
		t2 =  func(i+1,j-1,h,w);
	if(i+1<h&&j+1<w)
	{	
		t3 =  func(i+1,j+1,h,w);
		//printf("\tHere %d,%d:%d",t3,i,j);
	}
	dp[i][j] = max(t1,t2,t3) + arr[i][j];
	//printf("\nCalculated %d for %d:%d",dp[i][j],i,j);
	
	return dp[i][j];	
}
int main()
{
	int t,h,w,i,j,k;
	scanf("%d",&t);

	for(k=0;k<t;k++)
	{
		
		scanf("%d %d",&h,&w);
		
		for(i=0;i<h;i++)
		{
			for(j=0;j<w;j++)
			{
				scanf("%d",&arr[i][j]);
				dp[i][j]=-1;
			}
		}
		
		int max = -1;
		for(i=0;i<w;i++)
		{
			int temp = func(0,i,h,w);
			if(temp>max)
				max = temp;
		}	
		printf("%d\n",max);
	}
	
	return 0;

}	
