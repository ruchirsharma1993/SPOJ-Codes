#include<stdio.h>
int main()
{
	int n,i;
	scanf("%d",&n);
	while(n!=0)
	{
		int arr[n+1];
		int req=1;
		int cp=-1;
		for(i=0;i<n;i++)
		{
			int t;
			scanf("%d",&t);
			if(req==t)
				req++;
			else
			{
				cp++;
				arr[cp]=t;
			}
			while(cp>=0)
			{
				if(req==arr[cp])
					{cp--;req++;}
				else
					break;
			}
		
		}
		if((cp==0)||(req==n+1))
			printf("yes");
		else
			printf("no");
		printf("\n");
		scanf("%d",&n);
	}
	return 0;
}		
		
