#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	while(n!=0)
	{
		int arr[1424];
		int i,last=0;
		for(i=0;i<1424;i++)
			arr[i]=0;

		for(i=0;i<n;i++)
		{
			int t;	
			scanf("%d",&t);
			arr[t]=1;
			if(t>last)
			 	last=t;
		}
		
		int flag=1;
		int cur=0,scur=0;		
		for(i=0;i<=1422;i++)
		{
			if(arr[i]==1)
			{	
				scur=cur;				
				cur=i;
			}
			if((cur-scur)>200)
			{flag=0;break;}
					
		}
		
		//Return journey		
		
		if(((1422-last)*2)>200)
			flag=0;
		
		if(flag==1)
			printf("POSSIBLE");
		else
			printf("IMPOSSIBLE");
		printf("\n");
		
		scanf("%d",&n);
	}
	return 0;
}
		
