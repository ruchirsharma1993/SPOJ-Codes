#include<stdio.h>
int main()
{
	int i=10;
	int sum=0;
	int last,out;
	int arr[11];
	for(i=0;i<10;i++)	
		scanf("%d",&arr[i]);
	for(i=0;i<10;i++)
	{		
		
		last = sum;
		sum = sum+arr[i];
				
		if(sum>=100)
		{
			//check diff
			if(sum==100)
				out=100;			
			else if((100-last)==(sum-100))
				out = sum;
			else if((100-last)<(sum-100))
				out = last;
			else
				out = sum;
			break;
		}
		else
			out=sum;
	}	
	printf("%d",out);
	return 0;
}
