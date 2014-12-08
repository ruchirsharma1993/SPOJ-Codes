#include<stdio.h>
#include<string.h>
int priority(char c)
{
	if(c=='+')
		return 1;
	if(c=='-')
		return 2;
	if(c=='*')
		return 3;
	if(c=='/')
		return 4;
	if(c=='^')
		return 5;
	else
		return 0;
}			
	
int main()
{
	int t,i;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		char arr[405];
		//printf("%s",arr);
		scanf("%s",arr);
		int len = strlen(arr);	

		char out[405],stack[405];
		
		int j,co=0,cs=0;
		for(j=0;j<len;j++)
		{
			char c = arr[j]; 
			printf("\n reading: %c",arr[j]);
			if(c>=97&&c<=122)
			{
				out[co]=c;
				co++;
			}
			else if((c=='+')||(c=='-')||(c=='*')||(c=='/')||(c=='^'))
			{
				if(cs==0)
				{	stack[cs]=c;cs++;
					printf("Stack cs:%c",stack[cs-1]);	
				}
				else
				{
					int p1 = priority(stack[cs]);
					int p2 = priority(c);
					printf("In else: %c",c);
					while(p2>p1)
					{
						out[co]=stack[cs];
						stack[cs]=0;
						co++;cs--;
						
						if(cs==0)
							break;
						p1 = priority(stack[cs]);
					}
					if((p2<=p1)||(cs==0))
					{
						stack[cs]=c;
						printf("Stack status: %c",stack[cs]);
						cs++;
					}
				}
					
			}
		} int k;
		for(k=cs;k>=0;k--)
		{	
			out[co]=stack[k];
			co++;
		}
		
		for(k=0;k<=co;k++)
			printf("%c",out[k]);
		printf("\n\n");
	}
}
