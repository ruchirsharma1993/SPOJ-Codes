#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	int i;
	for(i=0;i<t;i++)
	{
		long long int n;
		scanf("%lld",&n);
		long long int j;
		long long int sum=0;
		for(j=0;j<n;j++)
		{
			long long int temp;
			scanf("%lld",&temp);
			long long int t1 = temp%n;
			sum = sum+t1;
		}
		if(sum%n==0)
			printf("YES");
		else
			printf("NO");
		printf("\n");
	}
	return 0;
}
