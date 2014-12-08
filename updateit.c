#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	long long int i,j,k,l;
	for(l=0;l<t;l++)
	{
		long long int n,u,count=0;
		scanf("%lld %lld",&n,&u);
		long long int arr[n+5],oarr[n+1];
		for(j=0;j<=n+1;j++)
			arr[j]=0;
			
		for(j=0;j<u;j++)
		{
			long long int l,r,val;
			scanf("%lld %lld %lld",&l,&r,&val);
			arr[l] = arr[l] + val;
			val = val*-1;
			arr[r+1] = arr[r+1]+val;
		}
		
		for(j=0;j<n;j++)
		{
			count = count + arr[j];
			oarr[j] = count;
		}
		long long int q;
		scanf("%lld",&q);
		for(j=0;j<q;j++)
		{
			long long int index;
			scanf("%lld",&index);
			printf("%lld\n",oarr[index]);
		}
	}
	return 0;
}
