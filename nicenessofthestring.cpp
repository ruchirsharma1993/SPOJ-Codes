#include<stdio.h>
#include<string>
#include<vector>
#include<iostream>
using namespace std;
int main()
{
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++)
	{
		char s[1005];
		vector<char *>v;
		int count=0;
		cin.getline(s,1004);
		int count=0;
		
		char *tok=strtok(s," ,\t");
		while(tok!=NULL)
		{
			int flag=0;
			for(int k=0;k<v.size();k++)
			{
				if(strcmp(v[k],tok)==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count++;
				v.push_back(tok);
			}
			
			tok = strtok(s,NULL);
		}
		printf("%d",count);
		printf("\n");
	}
	return 0;
}