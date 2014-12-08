#include<stdio.h>
long long int arr[1000005];
int main()
{
	long long int start=1;
	long long int twop=1;
	int count=0;
	while(count<1000)
	{
		long long int inp=start%1000000007;
		arr[count]=inp;
		start = (start*2)+twop;
		twop=(twop*2)%1000000007;
		
		count=count+1;
		//printf("\n%d: %lld",count,inp);
	}
	int i,t;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		int next;
		scanf("%d",&next);
		printf("Case %d: %lld\n",i+1,arr[next-1]);
	}
	return 0;

}
