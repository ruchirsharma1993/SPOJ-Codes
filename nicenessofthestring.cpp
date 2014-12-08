#include<stdio.h>
#include<string>
#include<cstring>
#include<iostream>
using namespace std;
int main()
{
	int t,i;
	cin>>t;	
	for(i=0;i<t;i++)
	{
		string s="";
		char c[500]; 
		getline(cin,s);
		strcpy(c, s.c_str());
		printf("%s",c);

	}
}
