#include<stdio.h>
#include<vector>
#include<algorithm>

using namespace std;
struct node
{
	long long int s;
	long long int e;
};
struct less_than_key
{
    inline bool operator() (const node& struct1, const node& struct2)
    {
        return (struct1.e < struct2.e);
    }
};

int main()
{
	int t,n,i,j;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%d",&n);
		vector<node> v;
		for(j=0;j<n;j++)
		{
			long long int a,b;
			scanf("%lld %lld",&a,&b);
			node ins;
			ins.s=a;
			ins.e=b;
			v.push_back(ins);
		}
		
		//See output
		std::sort(v.begin(), v.end(), less_than_key());
	//	printf("Sorting");
		long long int count=0;
		long long int last=-1;
		for(j=0;j<(int)v.size();j++)
		{
			node cur=v[j];
			if(cur.s>=last)
			{
				last=cur.e;
				count=count+1;
			}
			//printf("%d %d\n",cur.s,cur.e);
			
		}
		printf("%lld\n",count);
	}
	return 0;
}

