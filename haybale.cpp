#include<stdio.h>
#include<algorithm>
using namespace std;
int main()
{
	int n,k;
	scanf("%d %d",&n,&k);
	int j;
	int arr[n+5],oarr[n+5];
	for(j=0;j<n+2;j++)
		arr[j]=0;
			
	for(j=0;j<k;j++)
	{
		int l,r;
		scanf("%d %d",&l,&r);
		arr[l] = arr[l] + 1;
		
		arr[r+1] = arr[r+1]-1;
	}
	long long int count = 0;	
	for(j=1;j<=n;j++)
	{
		count = count + arr[j];
		oarr[j] = count;
	}
	
	
	
	//Print Median of orr
	int mid = n/2;
	mid = mid +1;
	/*for(j=1;j<=n;j++)
	{
		printf("%d ",oarr[j]);
	}*/
	sort(oarr+1,oarr+n+1);
	/*printf("\n");
	for(j=1;j<=n;j++)
	{
		printf("%d ",oarr[j]);
	}*/
	
	
	printf("%d",oarr[mid]);
	return 0;
}
