#include<stdio.h>
int main()
{
	int t,i;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		int n,m,d;
		scanf("%d",&n);
		scanf("%d",&m);
		scanf("%d",&d);
		
		int j,count=0;
		for(j=0;j<n;j++)
		{
			int temp;
			scanf("%d",&temp);
			while(1)
			{			
				if(temp>d)
					{temp=temp-d;count++;}
				else
					break;
			}
		}
		if(count>=m)
			printf("YES");
		else
			printf("NO");
		
		printf("\n");
	}
	return 0;
}
