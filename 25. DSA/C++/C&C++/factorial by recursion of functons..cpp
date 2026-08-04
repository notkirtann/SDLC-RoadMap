//WAP to write factorial by recursion of functons.
#include<stdio.h>
int fact(int);
main()
{
	int f,n;
	printf("Enter the value of n: ");
	scanf("%d",&n);
	f=fact(n);
	printf("Factorial is %lld",f);
}
int fact(int n)
{
	int f;
	if(n==1)
	return 1;
	else
	f=n*fact(n-1);
	return f;
}
