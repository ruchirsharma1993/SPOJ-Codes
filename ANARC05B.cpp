
#include<stdio.h>

int longestinc(int arr[],int n)
{
	
	//O(N^2)  Approach
	
	int list[n+2];
	int i,j,max=1;
	for(i=1;i<=n;i++)
	{
		list[i]=1;
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<i;j++)
		{
			if(arr[i]>arr[j])
			{
				if(list[i]<(list[j]+1))
					list[i] = list[j]+1;
				if(list[i]>max)
					max = list[i];	
			}
		}
	}
	return max;
	
}
int getindex(int list[],int ele, int start, int end)
{
	int mid;
	while(end-start>1)
	{
		 mid = start + ((end-start)/2);
		
		if(list[mid]>=ele)
			end = mid;
		
		else
			start = mid;
		
	}
	return end;
}

int logestinc(int arr[], int n)
{
	int list[n+2];
	list[0] = arr[1];
	int i,len=1;
	
	for(i=2;i<=n;i++)
	{
		if(arr[i]<list[0])
			list[0] = arr[i];
		
		else if(arr[i]>list[len-1])
		{
			list[len] = arr[i];
			len = len + 1;
		}
		else
		{
			int index = getindex(list,arr[i],-1,len-1);
			 
			list[index] = arr[i]; 
		}
		
	}
	return len;
}
int main()
{
	int t,i;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		 int j,n;
		scanf("%d",&n);
		
		int arr1[n+1],arr2[n+1],temp[n+1];
		for(j=1;j<=n;j++)
		{
			scanf("%d",&arr1[j]);
			temp[arr1[j]] = j;
		}
		for(j=1;j<=n;j++)
		{
			scanf("%d",&arr2[j]);
			arr1[j] = temp[arr2[j]];
		}
		
		/*// Print converted array
		
		for(j=1;j<=n;j++)
		{
			printf("%d ",arr1[j]);
		}
		*/
		int tot = logestinc(arr1,n);
		printf("%d\n",tot);	
	}
	return 0;
}
