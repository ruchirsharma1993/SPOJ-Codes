#include<stdio.h>
#include<stack>
using namespace std;
int main()
{
	int n;
	scanf("%d",&n);
	
	stack<long long int> s;
	long long int out=1,temp;
	for(int i=0;i<n;i++)
	{
		scanf("%lld",&temp);
		if(!s.empty())
		{
			while(s.top()<temp)
			{
				out = out * temp;
				out = out%1000000007;
				s.pop();
				if(s.empty())
					break;
			}
			
		}
		s.push(temp);
	}
	printf("%lld\n",out);
	return 0;
}
