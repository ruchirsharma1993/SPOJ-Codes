#include<stdio.h>
long long int arr[1001];

int main()
{
	int n;
	arr[0]=1;
	arr[1]=1;
	
	for(int i=2;i<1000;i++)
	{
		arr[i]=0;
		for(int j=0;j<i;j++)
		{
			arr[i] = arr[i] + (arr[j] * arr[i-j-1]);
			arr[i] = arr[i]%1000000;
		}
	}
	
	scanf("%d",&n);
	while(n!=0)
	{
		printf("%lld\n",arr[n]);
		scanf("%d",&n);
	}
	return 0;
}
