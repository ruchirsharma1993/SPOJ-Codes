#include<stdio.h>
#include<string.h>
int main()
{
	int n;
	scanf("%d",&n);
	while(n!=0)
	{
		char in[250];
		char out[250];
		
		scanf("%s",in);
		int len = strlen(in);
		
		int i,j,count=0,index=0;
		for(i=n;i>0;i--)
		{
			j=count;
			
			out[index] = in[count];
			index=index+1;
			
			j=j+(i*2)-1;
			int flag=1;
			while(j<len)
			{
				out[index]=in[j];
				//printf("\nnext: %c,j: %d",out[index],j);
				index=index+1;
				if(flag==1)	
				{
					j=j+(count*2)+1;
					flag=0;
				}
				else
				{
					j=j+(i*2)-1;
					flag=1;
				}	
			}
			count=count+1;
		}
		out[index]='\0';
		printf("%s\n",out);
		
		scanf("%d",&n);

	}
	return 0;
	
}
	
