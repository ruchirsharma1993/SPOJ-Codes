#include<stdio.h>
#include<vector>
#include<string>
#include<iostream>

using namespace std;
int main()
{
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++)
	{
		vector<string> v;
		int scores[100];
		int nteams=0;
		for(int j=0;j<16;j++)
		{
			string a,b;
			int a1,b1;
			int flag1=0,flag2=0;
			cin>>a;
			cin>>b;
			scanf("%d %d",&a1,&b1);
			//printf("Read : %s %s %d %d",a,b,a1,b1);
			
			//Check if a exist
			for(int k=0;k<(int)v.size();k++)
			{
				if(v[k].compare(a)==0)
				{
					flag1=1;
					if(a1<b1)
						scores[k]=0;
				}
		
			}
			
			if(flag1==0)
			{
				//Team one doesnt exist
				v.push_back(a);
				if(a1>b1)
					scores[nteams]=1;
				else
					scores[nteams]=0;
				nteams++;
			}
			
			//Check if b exist
			for(int k=0;k<(int)v.size();k++)
			{
				if(v[k].compare(b)==0)
				{
					flag2=1;
					if(a1>b1)
						scores[k]=0;
				}
		
			}
			
			if(flag2==0)
			{
				//Team one doesnt exist
				v.push_back(b);
				if(a1<b1)
					scores[nteams]=1;
				else
					scores[nteams]=0;
				nteams++;
			}
		}
		
		for(int k=0;k<nteams;k++)
		{
			if(scores[k]==1)
				cout<<v[k]<<endl;
		}
		//printf("\n");
	}
	return 0;
}