//WAP to do sum of n natural numbers.
#include<stdio.h>
int sum(int);
main()
{
	int f,n;
	printf("Enter the value of n: ");
	scanf("%d",&n);
	f=sum(n);
	printf("sum is %d",f);
}
int sum(int n)
{
	int f;
	if(n<1)
	return n;
	return n+sum(n-1);
}
