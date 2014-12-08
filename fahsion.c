//fashion 1025
#include<stdio.h>

int main()
{
	int t,n;
	scanf("%d",&t);
	int i;
	for(i=0;i<t;i++)
	{
		scanf("%d",&n);
		int j;
		int m[n+1],w[n+1];
		for(j=0;j<n;j++)
			scanf("%d",&m[j]);
		for(j=0;j<n;j++)
			scanf("%d",&w[j]);
		
		//Sort the arrays
		int k;
		for(j=0;j<n;j++)
		{
			for(k=j+1;k<n;k++)
			{
				if(m[j]>m[k])
				{
					int temp = m[j];
					m[j]=m[k];
					m[k]=temp;
				}
			}
		}
		
		
		for(j=0;j<n;j++)
		{
			for(k=j+1;k<n;k++)
			{
				if(w[j]>w[k])
				{
					int temp = w[j];
					w[j]=w[k];
					w[k]=temp;
				}
			}
		}
						
		//Printing
		/*printf("Man");
		for(j=0;j<n;j++)
			printf("%d: ",m[j]);
		
		printf("\n Women");
		for(j=0;j<n;j++)
			printf("%d: ",w[j]);

				*/
		long long int out=0;
		for(j=0;j<n;j++)
		{			
			int temp = m[j]*w[j];
			//printf("%d \ntemp: ",temp);
			out = out + temp;
		}
		printf("%lld",out);
		printf("\n");
	}
	return 0;

}
