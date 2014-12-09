#include <stdio.h>

int main()
{
	// your code goes here
	int t,n;
	int i,j;
	scanf("%d",&t);
	
	for(i=0;i<t;i++)
	{
		int max=-1;
		int till=-1;
		scanf("%d",&n);
		int arr[10005];
		for(j=0;j<10001;j++)
			arr[j]=0;
		for(j=0;j<n;j++)
		{
			int a,b;
			scanf("%d %d",&a,&b);
			arr[a]=arr[a]+1;
			arr[b+1]=arr[b+1]-1;
			if(b>till)
				till=b;
		}
		for(j=1;j<till+1;j++)
		{
			arr[j]=arr[j]+arr[j-1];
			if(max<arr[j])
				max=arr[j];
		}
		
		printf("%d\n",max);
	}
	
	return 0;
}
