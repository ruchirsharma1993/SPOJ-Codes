#include<stdio.h>
int main()
{
	int t;	
	scanf("%d",&t);
	int i;
	for(i=0;i<t;i++)
	{
		int n,j,sum=0;
		
		scanf("%d",&n);
		int arr[n+1];
		for(j=0;j<n;j++)
		{
			scanf("%d",&arr[j]);
			sum=sum+arr[j];
		}	
		int avg = sum/n;
		int cl=0,ch=0,ce=0,out=0;
	        for( j=0;j<n;j++)
		{
		        if(arr[j]<avg)
		            cl++;
		        else if(arr[j]>avg)
		            ch++;
		        if(arr[j]==avg)
		            ce++;
		}
		if(cl>ch)
                	out=cl+ce;
            	else
               		out =ch+ce;	
	
		printf("%d",out);
		printf("\n");
	}
	return 0;
}
