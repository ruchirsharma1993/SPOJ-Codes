#include<stdio.h>
long long int merge(int arr[],int low,int mid,int high)
{
	long long int count =0;
	int i=low;
	int j=mid;
	int k=low;
	int aux[high+1];
	//printf("\n Merging %d mid %d to %d",low,mid,high);
	while((i<=mid-1)&&(j<=high))
	{
		if(arr[i]<=arr[j])
		{
			aux[k++]=arr[i++];
		}
		else
		{
			aux[k++]=arr[j++];
			count  =  count+mid-i;			
		}	
	}
	while(i<=mid-1)
	{
		aux[k++]=arr[i++];
	}
	while(j<=high)
	{
		aux[k++]=arr[j++];
	}
	for(k=low;k<=high;k++)
		arr[k]=aux[k];
	
	return count;
}


long long int mergesort(int arr[],int low,int high)
{
	int mid = (low+high)/2;
	long long int count=0;
	if(high>low)
	{
		count= mergesort(arr,low,mid);
		//printf("\n In mergesort1, count is: %lld",count);
		count =  count+mergesort(arr,mid+1,high);
		
		//printf("\n In mergesort2, count is: %lld",count);	
		count = count + merge(arr,low,mid+1,high);

		//printf("\n In mergesort3, count is: %lld",count);
	}
	return count;
}






int main()
{
	int t,n,i,j,k;
	scanf("%d",&t);
	for(k=0;k<t;k++)
	{	
		scanf("%d",&n);
		int arr[n+1];
		for(j=0;j<n;j++)
			scanf("%d",&arr[j]);
		
		long long int count=0;
		count = mergesort(arr,0,n);
		printf("%lld",count);
		printf("\n");
	}
	return 0;
}
		
