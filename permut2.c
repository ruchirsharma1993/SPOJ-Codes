#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	while(t!=0)
	{
		int i,flag=0;
		int arr[t+2],pos[t+2];
		for(i=1;i<=t;i++)
		{
			scanf("%d",&arr[i]);
			pos[arr[i]]=i;
		}
		
		//Check
		if(pos[1]!=arr[1]||pos[t]!=arr[t])
			flag=1;
		else
		{
			for(i=1;i<t;i++)
			{
				if(pos[i]!=arr[i])
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)
			printf("not ambiguous");
		else
			printf("ambiguous");
	
		scanf("%d",&t);
		printf("\n");
	}
	return 0;
}
