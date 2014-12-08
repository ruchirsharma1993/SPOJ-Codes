#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++)
	{
		
		long long int num1,num;
		
		scanf("%lld",&num1);
		long long int sum=0;
		num=num1;
		while(num>0)
		{
			int temp = num%10;
			sum=sum+temp;
			num=num/10;
		}
		
		while(true)
		{
			
			//printf("\n%lld: %lld",sum,num1);
			if(num1%sum==0)
			{
				printf("%lld",num1);
				break;
			}
			else
			{
				
				
				sum = sum+1;
			
				num=num1;
				while(num%10==9)
				{
					sum = sum-9;
					num=num/10;
				}
				num1 = num1 +1 ;
			}
	
		
		}
		printf("\n");
	
	}
}
