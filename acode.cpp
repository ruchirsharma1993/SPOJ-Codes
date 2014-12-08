#include<string.h>
#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>


char n[1000007];
int main()
{
	scanf("%s",n);
	while(strcmp(n,"0")!=0)
	{
		
		if(strcmp(n,"0")==0)
		{
			printf("0\n");
			
			continue;
		}
		long long int len = strlen(n);
		
		unsigned long long  dp[len+10];
		
		for(long long int j=0;j<len+5;j++)
		{
			dp[j]=0;
		}
		dp[0]=1;
		 
		for(long long int in=1;in<len;in++)
  		{
		   int cur = 0;
		   /*int a = atoi(n[in-1]);
		   int b  = atoi(n[in]);
		   */
		   int a = n[in-1]-'0';
		   int b = n[in]-'0';
		   cur = a* 10;
		   cur = cur +b;
		   
		  // printf("cur is: %d",cur);
		   if(b!=0)
		   	dp[in] = dp[in-1];
		   if (cur<=26&&cur>9)
		   {
		   	if((in-2)>0)
		   	{
		   		dp[in] = dp[in]+dp[in-2];
		   	}
		   	else
		   		dp[in]=dp[in]+1;
		   	
		   } 
		   	
		   	
		  }
		  printf("%llu\n",dp[len-1]);
  		scanf("%s",n);
	}
	return 0;
}
