#include<stdio.h>
int arr[3500];
int main()
{
	int t,n,i,j;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%d",&n);
		
		for(j=0;j<n;j++)
		{	
			int a;
			scanf("%d",&a);
			if(a<0)
			{
				a=a*-1;
				a=a+1000;
			}
			arr[a]=arr[a]+1;
		}
		int flag=0,out=-1;
		for(j=0;j<2010;j++)
		{
			if(arr[j]>(n/2))
			{
				flag=1;
				out=j;
			}
			arr[j]=0;
		}
		
		//Print output
		if(flag==1)
		{
			if(out>1000)
			{
				
				out=out-1000;
				out=out*-1;
				printf("YES %d",out);
			}
			else
				printf("YES %d",out);
		}
		else
			printf("NO");
		
		printf("\n");
	}
	return 0;
}
		
		
			