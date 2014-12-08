#include<stdio.h>
#include<string.h>
int min(int l1,int l2, int l3)
{
	int ret = l1;
	if(l2<ret)
		ret = l2;
	if(l3<ret)
		ret = l3;
	return ret;
}
int main()
{
	int t,i,j,k;
	scanf("%d",&t);
	static int dp[2001][2001];
	char a[5005],b[5005];
	for(i=0;i<t;i++)
	{
		
		scanf("%s",a);
		scanf("%s",b);
		
		int la = strlen(a);
		int lb = strlen(b);
		
		
		for(j=0;j<=la;j++)
		{
			dp[j][0]=j;
		}
		for(j=0;j<=lb;j++)
		{
			dp[0][j]=j;
		}
		
		for(j=1;j<=la;j++)
		{
			for(k=1;k<=lb;k++)
			{
				int l1 = dp[j-1][k] +1;
				int l2 = dp[j][k-1] +1;
				int cost;
				if(a[j-1]==b[k-1])
					cost=0;
				else
					cost=1;
				int l3 = dp[j-1][k-1] + cost;
				dp[j][k] = min(l1,l2,l3); 
			}		
		}
		
		printf("%d\n",dp[la][lb]);	
	}
	return 0;
}
