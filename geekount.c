#include<stdio.h>
long long int func(int l,int r)
{
	int j;
	long long int count=0;
		for(j=l;j<=r;j++)
		{
			int num = j;
			int flag=0,even=0,odd=0;
			if(j<10)
			{
				if(j%2==0)
					flag=1;
										
			}			
			else while(num>0)
			{
				int temp = num%10;
								
				
				if(temp%2==0)
					even++;
				else
					odd++;
				
				if(even==2)
					{flag=1;break;}
				if((even==1)&&(odd==1))
					{flag=1;break;}
				num=num/10;
			}
			if(flag==1)
			{
				//printf("%d: ",j);
				count++;
			}
		}
		return count;
}
int main()
{
	int t,l,r,i;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%d",&l);
		scanf("%d",&r);
		long long int count=0;		
		if(r<=100)
			count = func(l,r);
		else if((r-l)<=200)		
			count = func(l,r);
		else
		{
			int m = l%100;
			int ln = l+100-m;
			m = r%100;
			int rn = r-m;
			int temp = rn-ln;
			temp=temp/100;
			temp = temp*75;
			count = func(l,ln-1) + temp + func(rn,r);
		}

		printf("%lld",count);
		printf("\n");
	}
	return 0;
}
				
			
