//He is offside
#include<stdio.h>
int main()
{
	int a,d;
	scanf("%d",&a);
	scanf("%d",&d);
	int i;
	while((a!=0)&&(d!=0))
	{	
		int att[a+1];
		int def;
		int i,min1=100000000,min2=100000000;
		for(i=0;i<a;i++)
		{
			scanf("%d",&att[i]);
		}
		for(i=0;i<d;i++)
		{
			scanf("%d",&def);
			if(def<min1)
			{
				min2=min1;
				min1=def;
			}
			else if(def<min2)
				min2=def;
		}
		int flag=0;
		for(i=0;i<a;i++)
		{
			
			if(att[i]<=min2)
			{
				if((att[i]==min1)&&(att[i]==min2))
					{}
				else if(att[i]==min2)	{}
				else
					flag=1;
			}
			if(flag==1)
				break;
		}
		if(flag==1)
			printf("Y");
		else
			printf("N");
		printf("\n");
		scanf("%d",&a);
		scanf("%d",&d);
	}
	return 0;
}
	
		
