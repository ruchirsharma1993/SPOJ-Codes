#include<stdio.h>
int main()
{
	int a,b;
	scanf("%d",&a);
	scanf("%d",&b);
	while(1)
	{
		int out;
		if((a==-1)&&(b==-1))
			break;
		if((a==0)&&(b==0))
			out=0;
		
		else if(a==b)
			out=1;
		else if(a==0)
			out =b;
		else if(b==0)
			out =a;
		else
		{
			if(a>b)
			{
				out = a/(b+1);
				if(a%(b+1)!=0)
					out++;		
			}			
			else
			{
				out = b/(a+1);
				if(b%(a+1)!=0)
					out++;
			}
		}
		printf("%d",out);
		printf("\n");

		scanf("%d",&a);
		scanf("%d",&b);
	}
	return 0;
}

			
	
