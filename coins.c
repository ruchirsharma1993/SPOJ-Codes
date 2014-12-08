#include<stdio.h>
int arr[1000000];
long long int max(long long int a, long long int b)
{
	if(a<b)
		return b;
	else 
		return a;
	
}
long long int func(long long int n)
{
	if(n<12)
		return n;
		
	if(n<1000000)
	{
		if(arr[n]!=0)
			return arr[n];
		else
		{
			arr[n]= max(n,(func(n/2)+func(n/3)+func(n/4)));
			return arr[n];
		}
	}
	return max(n,(func(n/2)+func(n/3)+func(n/4)));
}
int main()
{
	long long int n;
	char s[12];
	while(scanf("%lld",&n)!=EOF)
	{
		long long int out = func(n);
		printf("%lld\n",out); 
	}
	return 0;
}
