//15554. Niceness of the string
#include<stdio.h>
#include<string.h>
int main()
{
	int t,i;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		char str[1000];
		gets(str);
		printf("%s",str);
	}
	return 0;
}
