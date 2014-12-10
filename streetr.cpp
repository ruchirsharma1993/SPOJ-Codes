#include<stdio.h>
#include<algorithm>
using namespace std;
int gcd(int a,int b)
{
    int t;
    while(a)
    {
        t = a;
        a = b%a;
        b = t;
    }
    return b;
}
int main()
{
	int n;
	scanf("%d",&n);
	long long int arr[n+2],diff[n+2];
	
	scanf("%lld",&arr[0]);
	
	for(int j=1;j<n;j++)
	{
		scanf("%lld",&arr[j]);
		diff[j-1] = arr[j] - arr[j-1];
	}
	
	sort(arr,arr+n-1);
	sort(diff,diff+n-2);
	
	long long int ans=diff[0];
	for(int j=1;j<n-1;j++)
	{
		ans=gcd(ans,diff[j]);
	}
	
	//printf("ans is: %lld",ans);
	long long int count=0;
	for(int j=1;j<n;j++)
	{
		if(arr[j]-arr[j-1]>ans)
		{
			count = count + (arr[j]-arr[j-1])/ans;
			
			count--;
		}
	}
	printf("%lld\n",count);
	return 0;
}