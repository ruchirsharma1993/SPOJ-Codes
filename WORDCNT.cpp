#include<stdio.h>
#include<string.h>
#include<iostream>
using namespace std;

int main()
{
	int t,i;
	scanf("%d",&t);
	scanf("\n");
	
	for(i=0;i<t;i++)
	{
		char s[1000];
		int count=0;
		cin.getline(s,1000);
		int arr[1002];
		char *tok = strtok(s," ,\t,\r");
		while(tok!=NULL)
		{
			//printf("\ntok is: %s",tok);	
			int len = strlen(tok);
			arr[count]=len;
			count++;
			tok=strtok(NULL," ,\t,\r");
				
		}
		
		//Printing everything
		int cur = arr[0];
		int max=0,lmax=1;
		for(int j=1;j<count;j++)
		{
			if(arr[j]==cur)
			{
				lmax++;
			}
			else
			{
				cur=arr[j];
				if(lmax>max)
					max=lmax;
				lmax=1;
			}
			//printf("%d ",arr[j]);
		}
		if(lmax>max)
			max=lmax;
		//printf("%s\n",s);
		printf("%d\n",max);
	}
	return 0;
}
