#include<stdio.h>	
int arr[1000004];
long long int out[1000004];
long long int  cubes[101];
long long int bin_search(int s,int e,long long int val)
{
	if(s>=e)
		return -1;
		
	long long int mid = (s+e)/2;
	if(out[mid]==val)
		return mid;
		
	if(out[mid]>val)
	{
		return bin_search(s,mid,val);
	}
	else
		return bin_search(mid+1,e,val);
	
}
int main()
{

	
	int t,n,i,k;

	for(i=1;i<101;i++)
	{
		cubes[i] = i*i*i;
	}
	long long int count=2;
	arr[1]=1;
	
	for(int j=2;j<101;j++)
	{
		i=1;
		long long int num = cubes[j];
		//printf("\tHEre for num%lld",num);
		long long int temp=num;
		while(temp<=1000001)
		{
			
			arr[temp]=1;
			i=i+1;	
			temp =num*i;
		}
		
		
	
	}
	
	int ind=0;
	out[0]=1;
	ind=ind+1;
	for(long long int j=2;j<1000001;j++)
	{
		if(arr[j]==0)
		{
			out[ind]=j;
			ind=ind+1;
		}
		
	}
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		int outp,flag1=0;
		long long int temp;
		scanf("%lld",&temp);
		
		long long int ret = bin_search(0,ind,temp);
		if(ret==-1)
			printf("Case %d: Not Cube Free\n",i+1);
		else
			printf("Case %d: %lld\n",i+1,ret+1);
	}
	
	
	return 0;
}
